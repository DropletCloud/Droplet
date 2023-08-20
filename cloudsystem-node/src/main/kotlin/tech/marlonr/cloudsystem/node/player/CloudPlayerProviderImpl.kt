package tech.marlonr.cloudsystem.node.player

import tech.marlonr.cloudsystem.api.player.ICloudPlayer
import tech.marlonr.cloudsystem.api.player.ICloudPlayerProvider
import java.util.*
import java.util.concurrent.CompletableFuture

class CloudPlayerProviderImpl: ICloudPlayerProvider {
    val baseUrl = "https://localhost:8080" // TODO: variable in config file

    override fun getOnlinePlayers(): MutableList<CloudPlayerImpl> {
        TODO("Not yet implemented")
    }

    override fun getCloudPlayerByUUID(uuid: UUID): CloudPlayerImpl {
        TODO("Not yet implemented")
    }

    override fun getOnlinePlayersAsync(): CompletableFuture<MutableList<ICloudPlayer>> {
        TODO("Not yet implemented")
    }

    override fun getCloudPlayerByUUIDAsync(uuid: UUID): CompletableFuture<ICloudPlayer> {
        TODO("Not yet implemented")
    }

    override fun registerPlayer(cloudPlayer: ICloudPlayer) {
        TODO("Not yet implemented")
    }

    override fun unregisterPlayer(cloudPlayer: ICloudPlayer) {
        TODO("Not yet implemented")
    }
}