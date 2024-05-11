plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {

    implementation(libs.kotlin)
    implementation(libs.coroutine.core)
    implementation(libs.coroutine.android)
    implementation(libs.lifecycle.viewmodel.ktx)

}