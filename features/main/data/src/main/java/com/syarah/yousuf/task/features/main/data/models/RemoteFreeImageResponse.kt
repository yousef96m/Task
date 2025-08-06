package com.syarah.yousuf.task.features.main.data.models

import kotlinx.serialization.Serializable

@Serializable
data class RemoteFreeImageResponse(
    val status_code: Int,
    val success: RemoteFreeImageResponse.Success?
) {
    @Serializable
    data class Success(
        val image: RemoteFreeImageResponse.Image
    )

    @Serializable
    data class Image(
        val url: String
    )
}
