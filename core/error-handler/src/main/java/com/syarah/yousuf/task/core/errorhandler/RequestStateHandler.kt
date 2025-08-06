package com.syarah.yousuf.task.core.errorhandler

import androidx.compose.runtime.Composable
import com.syarah.yousuf.task.core.errorhandler.handlers.ErrorHandler

/**
 * Project: SyarahTask
 * Created: Aug 05, 2025
 *
 * @author Yousuf Abu Fadda
 */

@Composable
fun <T> RequestStateHandler(
    requestState: RequestState<T>,
    onLoading: @Composable () -> Unit,
    onSuccess: @Composable (T) -> Unit,
    retry: () -> Unit
) {
    when {
        requestState.isLoading() -> onLoading()

        requestState.isSuccess() -> {
            val data = requestState.getDataOrNull()
            data?.let { onSuccess(it) }
        }

        requestState.isError() -> {
            val throwable = requestState.getErrorOrNull()
            ErrorHandler(
                throwable = throwable,
                retry = retry
            )
        }
    }
}
