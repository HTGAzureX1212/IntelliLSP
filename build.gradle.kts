plugins {
    id("org.jetbrains.intellij") version "1.0"
    kotlin("jvm") version "1.5.10"
}

group = "com.htstudios"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

intellij {
    pluginName.set("IntelliLSP")
    version.set("2021.1.2")
}
