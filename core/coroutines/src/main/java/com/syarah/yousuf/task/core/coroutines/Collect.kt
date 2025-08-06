package com.syarah.yousuf.task.core.coroutines

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.cancellable
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch

inline fun <T> StateFlow<T>.collect(
    lifecycleOwner: LifecycleOwner,
    crossinline action: suspend (value: T) -> Unit
): Job {
    return lifecycleOwner.lifecycleScope.launch {
        flowWithLifecycle(lifecycleOwner.lifecycle).distinctUntilChanged().cancellable()
            .collect { value -> action(value) }
    }
}

inline fun <T> SharedFlow<T>.collect(
    lifecycleOwner: LifecycleOwner,
    crossinline action: suspend (value: T) -> Unit
): Job {
    return lifecycleOwner.lifecycleScope.launch {
        flowWithLifecycle(lifecycleOwner.lifecycle).cancellable().collect { value -> action(value) }
    }
}

inline fun <T> Flow<T>.collect(
    lifecycleOwner: LifecycleOwner,
    crossinline action: suspend (value: T) -> Unit
): Job {
    return lifecycleOwner.lifecycleScope.launch {
        flowWithLifecycle(lifecycleOwner.lifecycle).cancellable().collect { value -> action(value) }
    }
}
