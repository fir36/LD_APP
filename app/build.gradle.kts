plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.ld_app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ldapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation("com.launchdarkly:launchdarkly-android-client-sdk:5.1.0")
}
