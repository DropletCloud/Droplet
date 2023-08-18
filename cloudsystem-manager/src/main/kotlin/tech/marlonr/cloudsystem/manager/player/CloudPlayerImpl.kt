package tech.marlonr.cloudsystem.manager.player

import tech.marlonr.cloudsystem.api.instance.ICloudInstance
import tech.marlonr.cloudsystem.api.player.ICloudPlayer
import java.util.*
import java.util.concurrent.CompletableFuture

class CloudPlayerImpl(
    val uuid: UUID,
    val name: String
): ICloudPlayer {
    val customProperties = hashMapOf<String, String>()

    override fun getUUID(): UUID {
        return uuid
    }

    override fun getPlayerName(): String {
        return name
    }

    override fun getCurrentServer(): ICloudInstance {
        TODO("Not yet implemented")
    }

    override fun getCurrentServerAsync(): CompletableFuture<ICloudInstance> {
        TODO("Not yet implemented")
    }

    override fun getCustomProperties(): HashMap<String, String> {
        return customProperties
    }
}