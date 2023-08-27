package tech.marlonr.cloudsystem.library.kotlin.platform.impl

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

class PaperPlatform(private val httpClient: HttpClient): IPlatform {
    override val name = "Paper"
    override val jarNamePattern: String
        get() = TODO("Not yet implemented")
    override val type = PlatformType.PAPER_SERVER
    override val addonType = AddonType.PAPER_PLUGIN

    override suspend fun getMcVersions(): List<String> {
        return httpClient.get("https://api.papermc.io/v2/projects/paper/").body<ProjectResponse>().versions
    }

    override suspend fun getBuilds(mcVersion: String): List<String> {
        return httpClient.get("https://api.papermc.io/v2/projects/paper/versions/$mcVersion").body<ProjectVersionsResponse>().builds.map { it.toString() }
    }

    override suspend fun downloadJarFile(path: Path, mcVersion: String, build: String): Boolean {
        return downloadFile(
            httpClient,
            URL("https://api.papermc.io/v2/projects/paper/versions/$mcVersion/builds/$build/downloads/paper-$mcVersion-$build.jar"),
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