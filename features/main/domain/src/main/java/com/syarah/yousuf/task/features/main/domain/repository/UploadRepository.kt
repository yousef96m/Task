package com.syarah.yousuf.task.features.main.domain.repository

import android.net.Uri
import com.syarah.yousuf.task.features.main.domain.model.UploadItem
import com.syarah.yousuf.task.features.main.domain.model.UploadStatus
import kotlinx.coroutines.flow.Flow

interface UploadRepository {

    fun getUploads(): Flow<List<UploadItem>>

    suspend fun uploadImage(uri: Uri, id: String): Boolean

    suspend fun updateStatus(id: String, status: UploadStatus)

    suspend fun addUpload(item: UploadItem)

    suspend fun updateWorkId(id: String, workId: String)

    suspend fun pauseAll()

    suspend fun getActiveUploads(): List<UploadItem>
}
