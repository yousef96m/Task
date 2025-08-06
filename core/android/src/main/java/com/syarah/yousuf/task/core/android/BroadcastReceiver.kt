package com.syarah.yousuf.task.core.android

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Build

@SuppressLint("UnspecifiedRegisterReceiverFlag")
fun BroadcastReceiver.register(context: Context, filter: IntentFilter): Intent? {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        context.registerReceiver(this, filter, Context.RECEIVER_NOT_EXPORTED)
    } else {
        context.registerReceiver(this, filter)
    }
}
