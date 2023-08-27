package tech.marlonr.cloudsystem.library.kotlin.platform.impl

import tech.marlonr.cloudsystem.library.kotlin.platform.AddonType
import tech.marlonr.cloudsystem.library.kotlin.platform.IPlatform
import tech.marlonr.cloudsystem.library.kotlin.platform.PlatformType
import java.nio.file.Path

class PaperPlatform: IPlatform {
    override val name = "Paper"
    override val jarNamePattern: String
        get() = TODO("Not yet implemented")
    override val type = PlatformType.PAPER_SERVER
    override val addonType = AddonType.PAPER_PLUGIN

    override suspend fun getMcVersions(): List<String> {
        TODO("Not yet implemented")
    }

    override suspend fun getBuilds(mcVersion: String): List<String> {
        TODO("Not yet implemented")
    }

    override suspend fun downloadJarFile(path: Path, mcVersion: String, build: String): Boolean {
        TODO("Not yet implemented")
    }
}