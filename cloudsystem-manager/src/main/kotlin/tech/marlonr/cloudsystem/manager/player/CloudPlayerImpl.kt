package tech.marlonr.cloudsystem.manager.player

import tech.marlonr.cloudsystem.api.instance.ICloudInstance
import tech.marlonr.cloudsystem.api.player.ICloudPlayer
import java.util.*
import java.util.concurrent.CompletableFuture

class CloudPlayerImpl(
    val uuid: UUID,
    val name: String
): ICloudPlayer {
    @get:JvmName("kotlinGetCustomProperties") val customProperties = hashMapOf<String, String>()

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
        return customProperties
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