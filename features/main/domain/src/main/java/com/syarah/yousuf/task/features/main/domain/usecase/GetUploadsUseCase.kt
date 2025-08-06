package com.syarah.yousuf.task.features.main.domain.usecase

import com.syarah.yousuf.task.features.main.domain.repository.UploadRepository
import javax.inject.Inject

class GetUploadsUseCase @Inject constructor(
    private val repository: UploadRepository
) {
    operator fun invoke() = repository.getUploads()
}