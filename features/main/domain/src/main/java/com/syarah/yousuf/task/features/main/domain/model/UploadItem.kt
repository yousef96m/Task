package com.syarah.yousuf.task.features.main.domain.model

data class UploadItem(
    val id: String,
    val uri: String,
    val status: UploadStatus,
    val fileName: String,
    val progress: Int,
    val workId: String? = null

)
