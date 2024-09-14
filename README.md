[![](https://jitpack.io/v/long5436/oneui6-material3-dynamic-color-compose.svg)](https://jitpack.io/#long5436/oneui6-material3-dynamic-color-compose)

# OneUI 6 Material-3 Dynamic Color Compose

Since Samsung updated One UI 6, apps using Jetpack Compose with Material Design 3 no longer support dynamic colors on Samsung devices when update Compose-bom to version newer than 2024-01-00. This module is used to fix this issue until Samsung or Google officially resolves the issue.

[Understand the issue better](https://github.com/material-components/material-components-android/issues/3924)

## Getting Started

#### Add repository

```kts
// settings.gradle.kts 

repositories {
    ...
    maven { url = uri("https://jitpack.io") }
}
```
#### Add Dependency
```toml
# libs.versions.toml 

[versions]
...
oneui6Material3DynamicColorCompose = <version>


[libraries]
...
oneui6-material3-dynamic-color-compose = { module = "com.github.long5436:oneui6-material3-dynamic-color-compose", version.ref = "oneui6Material3DynamicColorCompose" }
```

```kts
// build.gradle.kts

dependencies {
    ...
    implementation(libs.oneui6.material3.dynamic.color.compose)
}

```

## Using

```kt
// From

val colorScheme = when {
    dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
        val context = LocalContext.current
           if (darkTheme) dynamicDarkColorScheme(context) 
           else dynamicLightColorScheme(context)
        }

    darkTheme -> DarkColorScheme 
    else -> LightColorScheme
}
```

```kt
// Change to

val colorScheme = when {
    dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
        val context = LocalContext.current
           if (darkTheme) dynamicDarkColorSchemeFix(context) 
           else dynamicLightColorSchemeFix(context)
        }

    darkTheme -> DarkColorScheme 
    else -> LightColorScheme
}
```
## Useful Links
- [Understand the issue better](https://github.com/material-components/material-components-android/issues/3924)
