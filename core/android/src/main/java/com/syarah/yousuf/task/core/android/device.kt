package com.syarah.yousuf.task.core.android

import android.app.Activity
import android.provider.Settings

fun Activity.getApplicationDeviceId(): String? {
    return Settings.Secure.getString(
        contentResolver,
        Settings.Secure.ANDROID_ID
    )
}
