plugins {
    id("java")
    kotlin("jvm") version "1.9.0"
    kotlin("plugin.serialization") version "1.9.0"
}

group = "tech.marlonr"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.26")
    implementation("org.jetbrains:annotations:24.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0-RC")
}

tasks.test {
    useJUnitPlatform()
}