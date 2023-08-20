package tech.marlonr.cloudsystem.library.kotlin.message

import tech.marlonr.cloudsystem.api.message.ISocketMessage

class SocketMessageImpl(
    private val name: String,
    private val content: String
): ISocketMessage {

    override fun getName(): String {
        return name
    }

    override fun getContent(): String {
        return content
    }
}