plugins {
    id("com.android.application")
}

android {
    namespace = "com.google.codelabs.mdc.java.shrine"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.google.codelabs.mdc.java.shrine"
        minSdk = 24
        // Kept at 34 so the app keeps the classic (non edge-to-edge) layout the codelab expects.
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("com.google.android.material:material:1.14.0")
    implementation("androidx.appcompat:appcompat:1.8.0")
    implementation("com.android.volley:volley:1.2.1")
    implementation("com.google.code.gson:gson:2.11.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")
}
