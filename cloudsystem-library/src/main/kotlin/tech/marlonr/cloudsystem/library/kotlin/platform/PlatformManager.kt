package tech.marlonr.cloudsystem.library.kotlin.platform

import io.ktor.client.*
import tech.marlonr.cloudsystem.library.kotlin.platform.impl.bukkit.PaperPlatform
import tech.marlonr.cloudsystem.library.kotlin.platform.impl.bukkit.PurpurPlatform

class PlatformManager(
    private val httpClient: HttpClient = HttpClient { }
) {

    val platforms = hashMapOf<String, IPlatform>(
        // Proxies
        
        // Bukkit
        "Paper" to PaperPlatform(httpClient),
        "Purpur" to PurpurPlatform(httpClient)

        // Modded

        // Standalone
    )
}