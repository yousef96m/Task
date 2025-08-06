package com.syarah.yousuf.task.core.android

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.Settings
import android.widget.Toast


/**
 * Project: SyarahTask
 * Created: Aug 05, 2025
 *
 * @author Yousuf Abu Fadda
 */

fun startGooglePlayStoreRatingApp(context: Context) {
    val intent = Intent(
        Intent.ACTION_VIEW,
        Uri.parse("https://play.google.com/store/apps/details?id=com.motory.ksa.motoryshop")
    )
    context.startActivity(intent)
}

fun Context.startDialIntent(phoneNumber: String) {
    val intent = Intent(Intent.ACTION_DIAL)
    intent.data = Uri.parse("tel:$phoneNumber")
    startActivity(intent)
}

fun Context.startAppSettingsIntent() {
    val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
        data = Uri.fromParts("package", packageName, null)
    }
    startActivity(intent)
}

fun startWhatsappIntent(context: Context, phone: String) {
    val url = "https://api.whatsapp.com/send?phone=${phone}"
    try {
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        context.startActivity(i)
    } catch (e: PackageManager.NameNotFoundException) {
        Toast.makeText(
            context,
            context.getString(R.string.whatsapp_is_not_installed),
            Toast.LENGTH_SHORT
        ).show()
        e.printStackTrace()
    }
}

fun startGoogleMap(context: Context, locationLink: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(locationLink))
    context.startActivity(intent)
}

fun Context.recreateUi() {
    val activity = (this as? Activity)

    activity?.let {
        val intent = Intent.makeRestartActivityTask(it.componentName)
        it.startActivity(intent)
    }
}
