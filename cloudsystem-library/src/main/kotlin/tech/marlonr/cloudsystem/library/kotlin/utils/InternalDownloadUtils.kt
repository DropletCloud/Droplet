package tech.marlonr.cloudsystem.library.kotlin.utils

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import java.io.File
import java.net.URL
import java.nio.file.Path

suspend fun downloadFile(httpClient: HttpClient, url: URL, path: Path): Boolean {
    runCatching {
        val content =
            httpClient.get(url)
                .body<HttpResponse>().readBytes()
        val file = File(path.toString())
        if (!file.exists()) file.createNewFile()
        file.writeBytes(content)
    }.onFailure {
        it.printStackTrace()
        return false
    }
    return true
}