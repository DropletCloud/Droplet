package tech.marlonr.cloudsystem.node.player

import kotlinx.serialization.Serializable
import tech.marlonr.cloudsystem.api.instance.ICloudInstance
import tech.marlonr.cloudsystem.api.player.ICloudPlayer
import tech.marlonr.cloudsystem.library.kotlin.serializers.UUIDSerializer
import java.util.*
import java.util.concurrent.CompletableFuture

@Serializable
class CloudPlayerImpl(
    @Serializable (with = UUIDSerializer::class) val uuid: UUID,
    val name: String
): ICloudPlayer {
    override fun getUUID(): UUID {
        return uuid
    }

    override fun getPlayerName(): String {
        return name
    }

    override fun getCurrentProxy(): ICloudInstance {
        TODO("Not yet implemented")
    }

    override fun getCurrentServer(): ICloudInstance {
        TODO("Not yet implemented")
    }

    override fun getCurrentProxyAsync(): CompletableFuture<ICloudInstance> {
        TODO("Not yet implemented")
    }

    override fun getCurrentServerAsync(): CompletableFuture<ICloudInstance> {
        TODO("Not yet implemented")
    }

    override fun getIpAddress(): String {
        TODO("Not yet implemented")
    }

    override fun getCustomProperties(): HashMap<String, String> {
        TODO("Not yet implemented")
    }

    override fun sendMessage(message: String?) {
        TODO("Not yet implemented")
    }

    override fun sendMiniMessage(miniMessage: String?) {
        TODO("Not yet implemented")
    }

    override fun kick(message: String?) {
        TODO("Not yet implemented")
    }

    override fun sendToInstance(serverName: String?) {
        TODO("Not yet implemented")
    }

    override fun sendToInstance(instance: ICloudInstance?) {
        TODO("Not yet implemented")
    }
}