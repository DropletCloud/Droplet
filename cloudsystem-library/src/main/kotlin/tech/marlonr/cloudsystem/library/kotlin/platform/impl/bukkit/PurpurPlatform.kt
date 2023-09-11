package tech.marlonr.cloudsystem.library.kotlin.platform.impl.bukkit

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.Serializable
import tech.marlonr.cloudsystem.library.kotlin.platform.AddonType
import tech.marlonr.cloudsystem.library.kotlin.platform.IPlatform
import tech.marlonr.cloudsystem.library.kotlin.platform.PlatformType
import tech.marlonr.cloudsystem.library.kotlin.utils.downloadFile
import java.net.URL
import java.nio.file.Path

class PurpurPlatform(private val httpClient: HttpClient): IPlatform {
    override val name = "Purpur"
    override val jarNamePattern = "purpur-\$mcVersion-\$build.jar"
    override val type = PlatformType.PAPER_SERVER
    override val addonType = AddonType.PAPER_PLUGIN

    override suspend fun getMcVersions(): List<String> {
        return httpClient.get("https://api.purpurmc.org/v2/purpur/").body<PurpurVersionsResponse>().versions
    }

    override suspend fun getBuilds(mcVersion: String): List<String> {
        return httpClient.get("https://api.purpurmc.org/v2/purpur/$mcVersion/").body<PurpurBuildsResponse>().builds.all
    }

    override suspend fun downloadJarFile(path: Path, mcVersion: String, build: String): Boolean {
        return downloadFile(
            httpClient,
            URL("https://api.purpurmc.org/v2/purpur/$mcVersion/$build/download"),
            path
        )
    }

    @Serializable
    data class PurpurVersionsResponse(
        val project: String,
        val versions: List<String>
    )

    @Serializable
    data class PurpurBuildsResponse(
        val builds: PurpurBuilds,
        val project: String,
        val version: String
    )

    @Serializable
    data class PurpurBuilds(
        val all: List<String>,
        val latest: String
    )
}