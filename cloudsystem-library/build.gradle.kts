plugins {
    kotlin("jvm") version "1.9.0"
    kotlin("plugin.serialization") version "1.9.0"
}

group = "tech.marlonr"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":cloudsystem-api"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0-RC")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}