plugins {
    alias(libs.plugins.android.application)
    id("de.mannodermaus.android-junit5") version "1.11.3.0"
}

android {



    namespace = "com.example.listycitylab6v2"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.listycitylab6v2"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_17
//        targetCompatibility = JavaVersion.VERSION_17
//    }

//    testOptions {
//        unitTests{
//            all {
//                useJUnitPlatform()
//            }
//        }
//    }
    tasks.withType<Test>{
        useJUnitPlatform()
    }
}

dependencies {

    implementation(files("C:/Users/Owner/AppData/Local/Android/Sdk/platforms/android-36/android.jar"))
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    testImplementation(libs.junit.jupiter.api)
    testRuntimeOnly(libs.junit.jupiter.engine)
    androidTestImplementation(libs.junit.v130)
    androidTestImplementation(libs.espresso.core.v370)
}
