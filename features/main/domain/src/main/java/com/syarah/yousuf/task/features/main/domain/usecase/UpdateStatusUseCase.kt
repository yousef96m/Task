package com.syarah.yousuf.task.features.main.domain.usecase

import com.syarah.yousuf.task.features.main.domain.model.UploadStatus
import com.syarah.yousuf.task.features.main.domain.repository.UploadRepository
import javax.inject.Inject

class UpdateStatusUseCase @Inject constructor(
    private val repository: UploadRepository
) {
    suspend operator fun invoke(id: String, status: UploadStatus) {
        repository.updateStatus(id, status)
    }
}