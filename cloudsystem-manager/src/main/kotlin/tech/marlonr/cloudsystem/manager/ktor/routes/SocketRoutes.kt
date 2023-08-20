package tech.marlonr.cloudsystem.manager.ktor.routes

import io.ktor.server.application.*
import io.ktor.server.routing.*
import tech.marlonr.cloudsystem.api.message.ISocketMessage
import tech.marlonr.cloudsystem.library.kotlin.message.SocketMessageImpl
import tech.marlonr.cloudsystem.manager.utils.json

fun Application.configureSocketRoutes() {
    routing {
        route("/sockets/internal") {

        }
    }
}

private inline fun <reified T> extractAction(message: String): Pair<String, T> {
    val deserializedMessage: ISocketMessage = json.decodeFromString<SocketMessageImpl>(message)

    return Pair(deserializedMessage.name, json.decodeFromString<T>(deserializedMessage.content))
}