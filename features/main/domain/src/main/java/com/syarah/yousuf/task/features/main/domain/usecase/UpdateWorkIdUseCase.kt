package com.syarah.yousuf.task.features.main.domain.usecase

import com.syarah.yousuf.task.features.main.domain.repository.UploadRepository
import javax.inject.Inject

class UpdateWorkIdUseCase @Inject constructor(
    private val repository: UploadRepository
) {
    suspend operator fun invoke(id: String, workId: String) {
        repository.updateWorkId(id, workId)
    }
}