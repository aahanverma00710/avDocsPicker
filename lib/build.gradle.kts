import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
}

android {
    namespace = "com.avcoding.avDocumentPicker"
    compileSdk = 33

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    api("androidx.core:core-ktx:1.9.0")
    api("androidx.appcompat:appcompat:1.5.1")
    api("com.google.android.material:material:1.7.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    api("androidx.navigation:navigation-fragment-ktx:2.5.3")
    //Allow multidex if function count exceeds the allowed limit in single dex
    api("androidx.multidex:multidex:2.0.1")
    api("androidx.lifecycle:lifecycle-process:2.5.0-rc01")
    //Lifecycle scope in activity, fragment etc
    api("androidx.lifecycle:lifecycle-runtime-ktx:2.2.5.0-rc01")
    //ViewModel scope
    api("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.0-rc01")
    // Saved state module for ViewModel
    api("androidx.lifecycle:lifecycle-viewmodel-savedstate:2.5.0-rc01")
    api("com.airbnb.android:lottie:6.3.0")

    //Glide
    api("com.github.bumptech.glide:glide:4.15.1")
    // Skip this if you don""t want to use integration libraries or configure Glide.
    kapt("com.github.bumptech.glide:compiler:4.15.1")
    api("com.github.bumptech.glide:recyclerview-integration:4.15.1")
}