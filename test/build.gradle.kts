plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    jvm()
    // add more targets if you need to.
}

dependencies {
    commonMainImplementation(project(":core"))
    kotlinCompilerPluginClasspath(project(":compiler"))
    commonTestImplementation(libs.kotlin.test)
}
