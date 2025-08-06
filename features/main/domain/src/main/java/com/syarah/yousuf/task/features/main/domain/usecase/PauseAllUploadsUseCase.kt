package com.syarah.yousuf.task.features.main.domain.usecase

import com.syarah.yousuf.task.features.main.domain.repository.UploadRepository
import javax.inject.Inject

class PauseAllUploadsUseCase @Inject constructor(
    private val repository: UploadRepository
) {
    suspend operator fun invoke() {
        repository.pauseAll()
    }
}