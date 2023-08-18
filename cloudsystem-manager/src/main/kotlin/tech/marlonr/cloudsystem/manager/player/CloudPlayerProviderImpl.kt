package tech.marlonr.cloudsystem.manager.player

import tech.marlonr.cloudsystem.api.player.ICloudPlayer
import tech.marlonr.cloudsystem.api.player.ICloudPlayerProvider
import java.util.*
import java.util.concurrent.CompletableFuture

class CloudPlayerProviderImpl: ICloudPlayerProvider {
    private val onlinePlayers = hashMapOf<UUID, ICloudPlayer>()

    override fun getOnlinePlayers(): MutableList<ICloudPlayer> {
        return onlinePlayers.values.toMutableList()
    }

    override fun getCloudPlayerByUUID(uuid: UUID): ICloudPlayer? {
        return onlinePlayers[uuid]
    }

    override fun getOnlinePlayersAsync(): CompletableFuture<MutableList<ICloudPlayer>> {
        return CompletableFuture.completedFuture(onlinePlayers.values.toMutableList())
    }

    override fun getCloudPlayerByUUIDAsync(uuid: UUID): CompletableFuture<ICloudPlayer?> {
        return CompletableFuture.completedFuture(onlinePlayers[uuid])
    }

    override fun registerPlayer(cloudPlayer: ICloudPlayer) {
        onlinePlayers[cloudPlayer.uuid] = cloudPlayer
    }

    override fun unregisterPlayer(cloudPlayer: ICloudPlayer) {
        onlinePlayers.remove(cloudPlayer.uuid)
    }
}