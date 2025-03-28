import android.databinding.tool.writer.ViewBinding


plugins {
    id("com.android.application")
}

android {
    namespace = "com.tamilcalender"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.tamilcalender"
        minSdk = 25
        targetSdk = 34
        versionCode = 16
        versionName = "4.2"

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



    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
        // Add these lines
        }
    buildToolsVersion = "34.0.0"
    ndkVersion = "25.0.8775105"


}

dependencies {

    implementation ("com.google.android.material:material:1.12.0")

    implementation("androidx.appcompat:appcompat:1.7.0")

    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.activity:activity:1.9.3")
    implementation("androidx.navigation:navigation-fragment:2.8.3")
    implementation("androidx.navigation:navigation-ui:2.8.3")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    implementation("androidx.cardview:cardview:1.0.0")

    implementation("com.google.android.gms:play-services-ads:23.5.0")

}
