package com.syarah.yousuf.task.core.network.utils

import com.syarah.yousuf.task.core.network.BuildConfig
import com.syarah.yousuf.task.core.network.entity.FlavorType

fun isProduction(): Boolean {
    return BuildConfig.FLAVOR == FlavorType.PRODUCTION_FLAVOR.type
}

fun isDevelopment(): Boolean {
    return BuildConfig.FLAVOR == FlavorType.DEVELOPMENT.type
}

fun isValidURL(url: String): Boolean {
    val pattern = """https?://[A-Za-z0-9.-]+\S*/""".toRegex()
    return pattern.matches(url)
}
