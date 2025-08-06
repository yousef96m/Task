package com.syarah.yousuf.task.core.errorhandler

import com.syarah.yousuf.task.core.errorhandler.exception.HttpStatus
import com.syarah.yousuf.task.core.errorhandler.exception.RemoteException
import com.syarah.yousuf.task.core.errorhandler.model.HttpErrorBodyModel
import kotlinx.serialization.json.Json
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class NetworkErrorMapper @Inject constructor(
    private val json: Json
) {

    fun map(
        throwable: Throwable
    ): RemoteException {
        return when (throwable) {
            is HttpException -> {
                val errorBody = throwable.response()?.errorBody()?.string()
                val error = if (errorBody != null) {
                    json.decodeFromString<HttpErrorBodyModel>(errorBody)
                } else {
                    HttpErrorBodyModel()
                }
                if (error.exception == null) {
                    RemoteException.Network(
                        throwable.message(),
                        throwable
                    )
                } else {
                    RemoteException.Http(
                        throwable.message(),
                        throwable,
                        error,
                        HttpStatus.valueOf(throwable.code())
                    )
                }
            }

            is IOException -> RemoteException.Network(throwable.message, throwable)
            else -> RemoteException.Unknown(throwable.message, throwable)
        }
    }
}
