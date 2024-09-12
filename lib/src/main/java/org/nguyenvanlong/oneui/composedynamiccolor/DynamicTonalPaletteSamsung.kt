package org.nguyenvanlong.oneui.composedynamiccolor

import android.content.Context
import android.os.Build
import androidx.annotation.ColorRes
import androidx.annotation.DoNotInline
import androidx.annotation.RequiresApi
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

data class TonalPalette(
    // The neutral tonal range from the generated dynamic color palette.
    val neutral100: Color,
    val neutral99: Color,
    val neutral95: Color,
    val neutral90: Color,
    val neutral80: Color,
    val neutral70: Color,
    val neutral60: Color,
    val neutral50: Color,
    val neutral40: Color,
    val neutral30: Color,
    val neutral20: Color,
    val neutral10: Color,
    val neutral0: Color,

    // The neutral variant tonal range from the generated dynamic color palette.
    val neutralVariant100: Color,
    val neutralVariant99: Color,
    val neutralVariant98: Color,
    val neutralVariant96: Color,
    val neutralVariant94: Color,
    val neutralVariant92: Color,
    val neutralVariant95: Color,
    val neutralVariant90: Color,
    val neutralVariant80: Color,
    val neutralVariant87: Color,
    val neutralVariant70: Color,
    val neutralVariant60: Color,
    val neutralVariant50: Color,
    val neutralVariant40: Color,
    val neutralVariant30: Color,
    val neutralVariant24: Color,
    val neutralVariant22: Color,
    val neutralVariant20: Color,
    val neutralVariant17: Color,
    val neutralVariant12: Color,
    val neutralVariant6: Color,
    val neutralVariant4: Color,
    val neutralVariant10: Color,
    val neutralVariant0: Color,

    // The primary tonal range from the generated dynamic color palette.
    val primary100: Color,
    val primary99: Color,
    val primary95: Color,
    val primary90: Color,
    val primary80: Color,
    val primary70: Color,
    val primary60: Color,
    val primary50: Color,
    val primary40: Color,
    val primary30: Color,
    val primary20: Color,
    val primary10: Color,
    val primary0: Color,

    // The secondary tonal range from the generated dynamic color palette.
    val secondary100: Color,
    val secondary99: Color,
    val secondary95: Color,
    val secondary90: Color,
    val secondary80: Color,
    val secondary70: Color,
    val secondary60: Color,
    val secondary50: Color,
    val secondary40: Color,
    val secondary30: Color,
    val secondary20: Color,
    val secondary10: Color,
    val secondary0: Color,

    // The tertiary tonal range from the generated dynamic color palette.
    val tertiary100: Color,
    val tertiary99: Color,
    val tertiary95: Color,
    val tertiary90: Color,
    val tertiary80: Color,
    val tertiary70: Color,
    val tertiary60: Color,
    val tertiary50: Color,
    val tertiary40: Color,
    val tertiary30: Color,
    val tertiary20: Color,
    val tertiary10: Color,
    val tertiary0: Color,

    val isDarkTheme: Boolean = false,
    val isSystemTheme: Boolean = true
)


/** Dynamic colors in Material. */
@RequiresApi(Build.VERSION_CODES.S)
internal fun dynamicTonalPalette(context: Context): TonalPalette = TonalPalette(
    // The neutral tonal range from the generated dynamic color palette.
    neutral100 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_0),
    neutral99 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_10),
    neutral95 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_50),
    neutral90 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_100),
    neutral80 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_200),
    neutral70 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_300),
    neutral60 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_400),
    neutral50 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_500),
    neutral40 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_600),
    neutral30 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_700),
    neutral20 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_800),
    neutral10 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_900),
    neutral0 = ColorResourceHelper.getColor(context, android.R.color.system_neutral1_1000),

    // The neutral variant tonal range, sometimes called "neutral 2",  from the
    // generated dynamic color palette.
    neutralVariant100 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_0),
    neutralVariant99 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_10),
    neutralVariant98 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
        .setLuminance(98f),
    neutralVariant96 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
        .setLuminance(96f),
    neutralVariant95 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_50),
    neutralVariant94 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
        .setLuminance(94f),
    neutralVariant92 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
        .setLuminance(92f),
    neutralVariant90 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_100),
    neutralVariant80 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_200),
    neutralVariant87 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
        .setLuminance(87f),
    neutralVariant70 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_300),
    neutralVariant60 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_400),
    neutralVariant50 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_500),
    neutralVariant40 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600),
    neutralVariant30 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_700),
    neutralVariant24 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
        .setLuminance(24f),
    neutralVariant22 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
        .setLuminance(22f),
    neutralVariant17 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
        .setLuminance(17f),
    neutralVariant12 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
        .setLuminance(12f),
    neutralVariant6 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
        .setLuminance(6f),
    neutralVariant4 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_600)
        .setLuminance(4f),
    neutralVariant20 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_800),
    neutralVariant10 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_900),
    neutralVariant0 = ColorResourceHelper.getColor(context, android.R.color.system_neutral2_1000),

    // The primary tonal range from the generated dynamic color palette.
    primary100 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_0),
    primary99 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_10),
    primary95 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_50),
    primary90 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_100),
    primary80 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_200),
    primary70 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_300),
    primary60 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_400),
    primary50 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_500),
    primary40 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_600),
    primary30 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_700),
    primary20 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_800),
    primary10 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_900),
    primary0 = ColorResourceHelper.getColor(context, android.R.color.system_accent1_1000),

    // The secondary tonal range from the generated dynamic color palette.
    secondary100 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_0),
    secondary99 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_10),
    secondary95 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_50),
    secondary90 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_100),
    secondary80 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_200),
    secondary70 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_300),
    secondary60 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_400),
    secondary50 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_500),
    secondary40 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_600),
    secondary30 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_700),
    secondary20 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_800),
    secondary10 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_900),
    secondary0 = ColorResourceHelper.getColor(context, android.R.color.system_accent2_1000),

    // The tertiary tonal range from the generated dynamic color palette.
    tertiary100 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_0),
    tertiary99 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_10),
    tertiary95 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_50),
    tertiary90 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_100),
    tertiary80 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_200),
    tertiary70 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_300),
    tertiary60 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_400),
    tertiary50 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_500),
    tertiary40 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_600),
    tertiary30 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_700),
    tertiary20 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_800),
    tertiary10 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_900),
    tertiary0 = ColorResourceHelper.getColor(context, android.R.color.system_accent3_1000),
)

/**
 * Creates a light dynamic color scheme.
 *
 * Use this function to create a color scheme based off the system wallpaper. If the developer
 * changes the wallpaper this color scheme will change accordingly. This dynamic scheme is a
 * light theme variant.
 *
 * @param context The context required to get system resource data.
 */
@RequiresApi(Build.VERSION_CODES.S)
fun dynamicLightColorSchemeSamsung(context: Context): ColorScheme {
    val tonalPalette = dynamicTonalPalette(context)
    return lightColorScheme(
        primary = tonalPalette.primary40,
        onPrimary = tonalPalette.primary100,
        primaryContainer = tonalPalette.primary90,
        onPrimaryContainer = tonalPalette.primary10,
        inversePrimary = tonalPalette.primary80,
        secondary = tonalPalette.secondary40,
        onSecondary = tonalPalette.secondary100,
        secondaryContainer = tonalPalette.secondary90,
        onSecondaryContainer = tonalPalette.secondary10,
        tertiary = tonalPalette.tertiary40,
        onTertiary = tonalPalette.tertiary100,
        tertiaryContainer = tonalPalette.tertiary90,
        onTertiaryContainer = tonalPalette.tertiary10,
        background = tonalPalette.neutralVariant98,
        onBackground = tonalPalette.neutralVariant10,
        surface = tonalPalette.neutralVariant98,
        onSurface = tonalPalette.neutralVariant10,
        surfaceVariant = tonalPalette.neutralVariant90,
        onSurfaceVariant = tonalPalette.neutralVariant30,
        inverseSurface = tonalPalette.neutralVariant20,
        inverseOnSurface = tonalPalette.neutralVariant95,
        outline = tonalPalette.neutralVariant50,
        outlineVariant = tonalPalette.neutralVariant80,
        scrim = tonalPalette.neutralVariant0,
        surfaceBright = tonalPalette.neutralVariant98,
        surfaceDim = tonalPalette.neutralVariant87,
        surfaceContainer = tonalPalette.neutralVariant94,
        surfaceContainerHigh = tonalPalette.neutralVariant92,
        surfaceContainerHighest = tonalPalette.neutralVariant90,
        surfaceContainerLow = tonalPalette.neutralVariant96,
        surfaceContainerLowest = tonalPalette.neutralVariant100,
        surfaceTint = tonalPalette.primary40,
    )
}

/**
 * Creates a dark dynamic color scheme.
 *
 * Use this function to create a color scheme based off the system wallpaper. If the developer
 * changes the wallpaper this color scheme will change accordingly. This dynamic scheme is a dark
 * theme variant.
 *
 * @param context The context required to get system resource data.
 */
@RequiresApi(Build.VERSION_CODES.S)
fun dynamicDarkColorSchemeSamsung(context: Context): ColorScheme {
    val tonalPalette = dynamicTonalPalette(context)
    return darkColorScheme(
        primary = tonalPalette.primary80,
        onPrimary = tonalPalette.primary20,
        primaryContainer = tonalPalette.primary30,
        onPrimaryContainer = tonalPalette.primary90,
        inversePrimary = tonalPalette.primary40,
        secondary = tonalPalette.secondary80,
        onSecondary = tonalPalette.secondary20,
        secondaryContainer = tonalPalette.secondary30,
        onSecondaryContainer = tonalPalette.secondary90,
        tertiary = tonalPalette.tertiary80,
        onTertiary = tonalPalette.tertiary20,
        tertiaryContainer = tonalPalette.tertiary30,
        onTertiaryContainer = tonalPalette.tertiary90,
        background = tonalPalette.neutralVariant6,
        onBackground = tonalPalette.neutralVariant90,
        surface = tonalPalette.neutralVariant6,
        onSurface = tonalPalette.neutralVariant90,
        surfaceVariant = tonalPalette.neutralVariant30,
        onSurfaceVariant = tonalPalette.neutralVariant80,
        inverseSurface = tonalPalette.neutralVariant90,
        inverseOnSurface = tonalPalette.neutralVariant20,
        outline = tonalPalette.neutralVariant60,
        outlineVariant = tonalPalette.neutralVariant30,
        scrim = tonalPalette.neutralVariant0,
        surfaceBright = tonalPalette.neutralVariant24,
        surfaceDim = tonalPalette.neutralVariant6,
        surfaceContainer = tonalPalette.neutralVariant12,
        surfaceContainerHigh = tonalPalette.neutralVariant17,
        surfaceContainerHighest = tonalPalette.neutralVariant22,
        surfaceContainerLow = tonalPalette.neutralVariant10,
        surfaceContainerLowest = tonalPalette.neutralVariant4,
        surfaceTint = tonalPalette.primary80,
    )
}

@RequiresApi(23)
private object ColorResourceHelper {
    @DoNotInline
    fun getColor(context: Context, @ColorRes id: Int): Color {
        return Color(context.resources.getColor(id, context.theme))
    }
}
