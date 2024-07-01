buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.0") // Actualizado para soportar SDK 34
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}