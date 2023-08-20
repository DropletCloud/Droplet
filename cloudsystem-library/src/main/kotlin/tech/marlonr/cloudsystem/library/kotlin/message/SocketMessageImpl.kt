package tech.marlonr.cloudsystem.library.kotlin.message

import kotlinx.serialization.Serializable
import tech.marlonr.cloudsystem.api.message.ISocketMessage

@Serializable
class SocketMessageImpl(
    @get:JvmName("kotlinGetName") val name: String,
    @get:JvmName("kotlinGetContent")val content: String
): ISocketMessage {

    override fun getName(): String {
        return name
    }

    override fun getContent(): String {
        return content
    }
}