package com.syarah.yousuf.task.core.android

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.core.content.ContextCompat

fun Context.isGranted(permission: String): Boolean {
    return ContextCompat.checkSelfPermission(this, permission) == PERMISSION_GRANTED
}

fun Context.isGranted(permissions: Array<String>): Boolean {
    return permissions.all { permission -> isGranted(permission) }
}

fun Context.isAnyGranted(permissions: Array<String>): Boolean {
    return permissions.any { permission -> isGranted(permission) }
}

@Composable
fun RequestCameraPermission(
    requestPermission: MutableState<Boolean>,
    onPermissionGranted: () -> Unit,
    onPermissionDenied: () -> Unit
) {
    val cameraPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            onPermissionGranted()
        } else {
            onPermissionDenied()
            requestPermission.value = false
        }
    }
    LaunchedEffect(Unit) {
        cameraPermissionLauncher.launch(Manifest.permission.CAMERA)
    }
}

@Composable
fun CheckNotificationPermission() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        val launcher = rememberLauncherForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { _ ->
            Unit
        }
        LaunchedEffect(Unit) {
            launcher.launch(Manifest.permission.POST_NOTIFICATIONS)
        }
    }
}
