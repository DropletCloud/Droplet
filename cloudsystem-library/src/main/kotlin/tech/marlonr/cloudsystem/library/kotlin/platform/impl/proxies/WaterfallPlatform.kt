package tech.marlonr.cloudsystem.library.kotlin.platform.impl.proxies

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tech.marlonr.cloudsystem.library.kotlin.platform.AddonType
import tech.marlonr.cloudsystem.library.kotlin.platform.IPlatform
import tech.marlonr.cloudsystem.library.kotlin.platform.PlatformType
import tech.marlonr.cloudsystem.library.kotlin.utils.downloadFile
import java.net.URL
import java.nio.file.Path

class WaterfallPlatform(private val httpClient: HttpClient): IPlatform {
    override val name = "Waterfall"
    override val jarNamePattern = "waterfall-\$mcVersion-\$build.jar"
    override val type = PlatformType.PROXY
    override val addonType = AddonType.BUNGEECORD_PLUGIN

    override suspend fun getMcVersions(): List<String> {
        return httpClient.get("https://api.papermc.io/v2/projects/waterfall/").body<ProjectResponse>().versions
    }

    override suspend fun getBuilds(mcVersion: String): List<String> {
        return httpClient.get("https://api.papermc.io/v2/projects/waterfall/versions/$mcVersion").body<ProjectVersionsResponse>().builds.map { it.toString() }
    }

    override suspend fun downloadJarFile(path: Path, mcVersion: String, build: String): Boolean {
        return downloadFile(
            httpClient,
            URL("https://api.papermc.io/v2/projects/waterfall/versions/$mcVersion/builds/$build/downloads/waterfall-$mcVersion-$build.jar"),
            path
        )
    }

    @Serializable
    data class ProjectResponse(
        @SerialName("project_id") val projectId: String,
        @SerialName("project_name") val projectName: String,
        @SerialName("version_groups") val versionGroups: List<String>,
        val versions: List<String>,
    )

    @Serializable
    data class ProjectVersionsResponse(
        @SerialName("project_id") val projectId: String,
        @SerialName("project_name") val projectName: String,
        val version: String,
        val builds: List<Int>
    )
}