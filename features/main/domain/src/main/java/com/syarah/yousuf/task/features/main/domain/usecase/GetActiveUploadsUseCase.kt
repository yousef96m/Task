package com.syarah.yousuf.task.features.main.domain.usecase

import com.syarah.yousuf.task.features.main.domain.model.UploadItem
import com.syarah.yousuf.task.features.main.domain.repository.UploadRepository
import javax.inject.Inject

class GetActiveUploadsUseCase @Inject constructor(
    private val repository: UploadRepository
) {
    suspend operator fun invoke(): List<UploadItem> {
        return repository.getActiveUploads()
    }
}