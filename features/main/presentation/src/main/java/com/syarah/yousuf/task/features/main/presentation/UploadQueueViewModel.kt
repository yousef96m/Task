package com.syarah.yousuf.task.features.main.presentation

import android.content.Context
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf
import com.syarah.yousuf.task.features.main.domain.model.UploadItem
import com.syarah.yousuf.task.features.main.domain.model.UploadStatus
import com.syarah.yousuf.task.features.main.domain.usecase.AddImageToQueueUseCase
import com.syarah.yousuf.task.features.main.domain.usecase.GetActiveUploadsUseCase
import com.syarah.yousuf.task.features.main.domain.usecase.GetUploadsUseCase
import com.syarah.yousuf.task.features.main.domain.usecase.PauseAllUploadsUseCase
import com.syarah.yousuf.task.features.main.domain.usecase.UpdateStatusUseCase
import com.syarah.yousuf.task.features.main.domain.usecase.UpdateWorkIdUseCase
import com.syarah.yousuf.task.features.main.domain.worker.UploadWorker
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.util.UUID
import javax.inject.Inject

@HiltViewModel
class UploadQueueViewModel @Inject constructor(
    private val addImageToQueue: AddImageToQueueUseCase,
    private val getUploadsUseCase: GetUploadsUseCase,
    private val updateStatusUseCase: UpdateStatusUseCase,
    private val updateWorkIdUseCase: UpdateWorkIdUseCase,
    private val getActiveUploadsUseCase: GetActiveUploadsUseCase,
    private val pauseAllUploadsUseCase: PauseAllUploadsUseCase
) : ViewModel() {

    val uploads = getUploadsUseCase()
        .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    fun addImage(uri: Uri) = viewModelScope.launch {
        addImageToQueue(uri)
    }

    fun startQueuedUploads(context: Context) = viewModelScope.launch {
        uploads.value
            .filter { it.status == UploadStatus.QUEUED }
            .forEach { item ->
                enqueueWorker(item, context)
            }
    }

    private fun enqueueWorker(item: UploadItem, context: Context) {
        val request = OneTimeWorkRequestBuilder<UploadWorker>()
            .setInputData(
                workDataOf(
                    "id" to item.id,
                    "uri" to item.uri
                )
            )
            .setConstraints(
                Constraints.Builder()
                    .setRequiredNetworkType(NetworkType.CONNECTED)
                    .build()
            )
            .build()

        viewModelScope.launch {
            updateWorkIdUseCase(item.id, request.id.toString())
        }
        WorkManager.getInstance(context).enqueue(request)
    }

    fun cancelUpload(id: String, context: Context) = viewModelScope.launch {
        val upload = uploads.value.find { it.id == id } ?: return@launch
        upload.workId?.let {
            WorkManager.getInstance(context).cancelWorkById(UUID.fromString(it))
            updateStatusUseCase(id, UploadStatus.CANCELED)
        }
    }

    fun pauseAllUploads() = viewModelScope.launch {
        pauseAllUploadsUseCase()
    }

    fun resumeAllUploads(context: Context) = viewModelScope.launch {
        getActiveUploadsUseCase().forEach { enqueueWorker(it, context) }
    }
}
