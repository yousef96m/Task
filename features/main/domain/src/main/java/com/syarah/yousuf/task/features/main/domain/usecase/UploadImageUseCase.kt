package com.syarah.yousuf.task.features.main.domain.usecase

import android.net.Uri
import com.syarah.yousuf.task.features.main.domain.model.UploadStatus
import com.syarah.yousuf.task.features.main.domain.repository.UploadRepository
import javax.inject.Inject

class UploadImageUseCase @Inject constructor(
    private val repository: UploadRepository
) {

    suspend operator fun invoke(uri: Uri, id: String): Boolean {
        repository.updateStatus(id, UploadStatus.UPLOADING)
        val success = repository.uploadImage(uri, id)
        repository.updateStatus(id, if (success) UploadStatus.COMPLETED else UploadStatus.FAILED)
        return success
    }
}
