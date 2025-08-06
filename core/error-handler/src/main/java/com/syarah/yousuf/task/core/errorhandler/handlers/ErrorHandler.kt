package com.syarah.yousuf.task.core.errorhandler.handlers

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import retrofit2.HttpException
import java.net.UnknownHostException

@Composable
fun ErrorHandler(
    throwable: Throwable?,
    retry: () -> Unit,
) {
    var showNoInternetDialog by remember { mutableStateOf(false) }
    var showErrorDialog by remember { mutableStateOf(false) }

    // This block will only be executed when the `throwable` changes
    LaunchedEffect(throwable) {
        when (throwable) {
            is UnknownHostException -> {
                showNoInternetDialog = true
            }


            is HttpException -> {
                if (throwable.code() != 401) {
                    showErrorDialog = true
                }
            }

            else -> {
                showErrorDialog = true
            }
        }
    }
}
