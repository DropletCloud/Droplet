package tech.marlonr.cloudsystem.library.kotlin.platform

import java.nio.file.Path

interface IPlatform {

    val name: String
    val jarNamePattern: String
    val type: PlatformType
        get() = false
    val addonFolder: String?
        get() = null
    val spigotBased: Boolean
        get() = false

    suspend fun getMcVersions(): List<String>
    suspend fun getBuilds(mcVersion: String): List<String>
    suspend fun downloadJarFile(path: Path, mcVersion: String, build: String): Boolean
    suspend fun installServer(workingDirectory: Path, installerJarFile: Path, mcVersion: String, build: String) = Unit
}