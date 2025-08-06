package com.syarah.yousuf.task.core.errorhandler


import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
sealed class RequestState<out T> {

    @Serializable
    data object Idle : RequestState<Nothing>()

    @Serializable
    data object Loading : RequestState<Nothing>()

    @Serializable
    data class Success<out T>(val data: T) : RequestState<T>()

    @Serializable
    data class Error(
        @Transient val throwable: Throwable? = null,
    ) : RequestState<Nothing>()

    fun isLoading(): Boolean = this is Loading
    fun isSuccess(): Boolean = this is Success
    fun isError(): Boolean = this is Error

    fun getDataOrNull(): T? = (this as? Success<T>)?.data

    fun getErrorOrNull(): Throwable? = (this as? Error)?.throwable
}
