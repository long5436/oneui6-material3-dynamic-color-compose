package org.nguyenvanlong.oneui.composedynamiccolor

import android.content.Context
import android.os.Build
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme

fun checkIsOneUI6(): Boolean {
    return (Build.VERSION.SDK_INT == Build.VERSION_CODES.UPSIDE_DOWN_CAKE) && Build.BRAND == "samsung"
}

fun dynamicDarkColorSchemeFix(context: Context): ColorScheme {
    return if (checkIsOneUI6()) {
        dynamicDarkColorSchemeSamsung(context)
    } else {
        return dynamicDarkColorScheme(context)
    }
}

fun dynamicLightColorSchemeFix(context: Context): ColorScheme {
    return if (checkIsOneUI6()) {
        dynamicLightColorSchemeSamsung(context)
    } else {
        return dynamicLightColorScheme(context)
    }
}