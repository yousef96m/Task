package com.syarah.yousuf.task.features.main.data.repository

import android.content.Context
import android.net.Uri
import com.syarah.yousuf.task.features.main.data.dao.UploadDao
import com.syarah.yousuf.task.features.main.data.mapper.UploadMapper
import com.syarah.yousuf.task.features.main.data.remote.RemoteUploadDataSource
import com.syarah.yousuf.task.features.main.domain.model.UploadItem
import com.syarah.yousuf.task.features.main.domain.model.UploadStatus
import com.syarah.yousuf.task.features.main.domain.repository.UploadRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import java.io.File
import javax.inject.Inject

class UploadRepositoryImpl @Inject constructor(
    private val dao: UploadDao,
    private val api: RemoteUploadDataSource,
    private val mapper: UploadMapper,
    @ApplicationContext private val context: Context
) : UploadRepository {

    override suspend fun uploadImage(uri: Uri, id: String): Boolean {
        return try {
            val file = uriToFile(uri) ?: return false
            val requestBody = file.asRequestBody("image/*".toMediaType())
            val fileName = uri.lastPathSegment ?: "upload_${System.currentTimeMillis()}.jpg"
            val part = MultipartBody.Part.createFormData("source", fileName, requestBody)

            val apiKey = "6d207e02198a847aa98d0a2a901485a5"
            val response = api.uploadImage(apiKey, part)

            if (response.status_code == 200 && response.success != null) {
                dao.updateStatus(id, UploadStatus.COMPLETED.name)
                true
            } else {
                dao.updateStatus(id, UploadStatus.FAILED.name)
                false
            }
        } catch (e: Exception) {
            dao.updateStatus(id, UploadStatus.FAILED.name)
            false
        }
    }

    override fun getUploads(): Flow<List<UploadItem>> =
        dao.getAll().map { list -> list.map { mapper.entityToDomain(it) } }

    override suspend fun updateStatus(id: String, status: UploadStatus) {
        dao.updateStatus(id, status.name)
    }

    override suspend fun addUpload(item: UploadItem) {
        dao.insert(mapper.domainToEntity(item))
    }

    override suspend fun updateWorkId(id: String, workId: String) {
        dao.updateWorkId(id, workId)
    }

    override suspend fun pauseAll() {
        dao.updateStatuses(
            listOf(UploadStatus.QUEUED.name, UploadStatus.UPLOADING.name),
            UploadStatus.QUEUED.name
        )
    }

    override suspend fun getActiveUploads(): List<UploadItem> {
        return dao.getByStatuses(
            listOf(UploadStatus.QUEUED.name, UploadStatus.UPLOADING.name)
        ).map { mapper.entityToDomain(it) }
    }

    private fun uriToFile(uri: Uri): File? {
        return try {
            val inputStream = context.contentResolver.openInputStream(uri) ?: return null
            val tempFile = File(context.cacheDir, "upload_${System.currentTimeMillis()}.jpg")
            inputStream.use { input ->
                tempFile.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            tempFile
        } catch (e: Exception) {
            null
        }
    }
}