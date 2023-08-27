package tech.marlonr.cloudsystem.library.kotlin.platform

import io.ktor.client.*
import tech.marlonr.cloudsystem.library.kotlin.platform.impl.PaperPlatform

class PlatformManager {

    private val httpClient = HttpClient {

    }

    val platforms = hashMapOf<String, IPlatform>(
        "Paper" to PaperPlatform(httpClient)
    )
}