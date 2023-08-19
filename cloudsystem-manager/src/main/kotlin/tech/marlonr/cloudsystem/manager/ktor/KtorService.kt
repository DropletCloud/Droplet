package tech.marlonr.cloudsystem.manager.ktor

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import tech.marlonr.cloudsystem.manager.utils.config.CloudConfigManager

class KtorService(private val host: String, private val port: Int = 8080) {

    fun start() {
        embeddedServer(Netty, host = "127.0.0.1", port = CloudConfigManager.getConfig().communicationRestServicePort, module = Application::module).start(wait = true)
    }
}

fun Application.module() {
    configureAuth()
}