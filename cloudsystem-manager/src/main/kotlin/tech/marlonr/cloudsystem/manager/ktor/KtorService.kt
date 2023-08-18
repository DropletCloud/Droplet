package tech.marlonr.cloudsystem.manager.ktor

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlin.concurrent.thread

class KtorService(private val host: String, private val port: Int = 8080) {

    fun start() {
        embeddedServer(Netty, host = host, port = port, module = Application::module).start(wait = true)
    }
}

fun Application.module() {

}