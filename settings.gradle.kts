pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.android" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21") // Asegúrate de que la versión es la deseada
                "com.android.application" -> useModule("com.android.tools.build:gradle:7.0.2")
            }
        }
    }
}

rootProject.name = "KOTLIN_INNOVATEC"
include(":app")
