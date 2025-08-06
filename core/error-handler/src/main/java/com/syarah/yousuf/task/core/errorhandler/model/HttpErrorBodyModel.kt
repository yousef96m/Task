package com.syarah.yousuf.task.core.errorhandler.model

import kotlinx.serialization.Serializable

@Serializable
data class HttpErrorBodyModel(

    val status: Int? = null,
    val message: String? = null,
    val data: String? = null,
    val exception: String? = null,
    val errors: List<Error>? = listOf(),
)

@Serializable
data class Error(
    var field: String? = null,
    var value: String? = null
)
