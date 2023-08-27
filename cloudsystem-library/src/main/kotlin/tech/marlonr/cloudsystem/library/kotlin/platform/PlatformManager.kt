package tech.marlonr.cloudsystem.library.kotlin.platform

import io.ktor.client.*
import tech.marlonr.cloudsystem.library.kotlin.platform.impl.bukkit.PaperPlatform
import tech.marlonr.cloudsystem.library.kotlin.platform.impl.bukkit.PurpurPlatform
import tech.marlonr.cloudsystem.library.kotlin.platform.impl.proxies.VelocityPlatform

class PlatformManager(
    private val httpClient: HttpClient = HttpClient { }
) {

    val platforms = hashMapOf<String, IPlatform>(
        // Proxies
        "Velocity" to VelocityPlatform(httpClient),

        // Bukkit
        "Paper" to PaperPlatform(httpClient),
        "Purpur" to PurpurPlatform(httpClient)

        // Modded

        // Standalone
    )
}