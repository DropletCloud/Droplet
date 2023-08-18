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

    implementation("io.ktor:ktor-server-core-jvm:2.3.3")
    implementation("io.ktor:ktor-server-netty-jvm:2.3.3")
    implementation("io.ktor:ktor-server-status-pages-jvm:2.3.3")
    implementation("io.ktor:ktor-server-default-headers-jvm:2.3.3")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}