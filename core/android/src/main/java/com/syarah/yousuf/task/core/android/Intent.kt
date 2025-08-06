package com.syarah.yousuf.task.core.android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Parcelable

@SuppressLint("UnspecifiedRegisterReceiverFlag")
inline fun <reified T : Parcelable> Intent.getParcelable(key: String): T? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        getParcelableExtra(key, T::class.java)
    } else {
        getParcelableExtra(key)
    }
}
