package com.syarah.yousuf.task.features.main.domain.usecase

import android.net.Uri
import java.util.UUID
import javax.inject.Inject

class AddImageToQueueUseCase @Inject constructor(
    private val uploadImageUseCase: UploadImageUseCase
) {
    suspend operator fun invoke(uri: Uri) {
        val id = UUID.randomUUID().toString()
        uploadImageUseCase.invoke(
            uri = uri,
            id = id,
        )
    }
}
