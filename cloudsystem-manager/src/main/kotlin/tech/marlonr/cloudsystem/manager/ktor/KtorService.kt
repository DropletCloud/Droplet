package tech.marlonr.cloudsystem.manager.ktor

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import tech.marlonr.cloudsystem.manager.ktor.routes.configureSocketRoutes
import tech.marlonr.cloudsystem.manager.utils.config.CloudConfigManager

class KtorService(private val host: String, private val port: Int = 8080) {

    val embeddedServer = embeddedServer(
        Netty,
        host = "127.0.0.1",
        port = CloudConfigManager.getConfig().communicationRestServicePort,
        module = Application::module
    )

    fun start() {
        embeddedServer.start(wait = true)
    }
    fun stop() {
        embeddedServer.stop()
    }
}

fun Application.module() {
    install(ContentNegotiation) {
        json(tech.marlonr.cloudsystem.manager.utils.json)
    }

    configureAuth()
    configureSocketRoutes()
}