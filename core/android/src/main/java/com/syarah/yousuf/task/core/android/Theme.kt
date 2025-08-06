package com.syarah.yousuf.task.core.android

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources

fun Context.isDarkMode(): Boolean {
    return (Resources.getSystem().configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
}
