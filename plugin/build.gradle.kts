plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.0.21"
    id("org.jetbrains.intellij") version "1.17.4"
}

group = "org.rgc"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

intellij {
    version.set("2024.2.2")   // IntelliJ IDEA 2024.2.2 (build 242)
    type.set("IC")            // IntelliJ IDEA Community Edition
    plugins.set(listOf("com.intellij.modules.platform"))
}

tasks {
    patchPluginXml {
        sinceBuild.set("242")
        untilBuild.set("")
    }
}

kotlin {
    jvmToolchain(17)
}