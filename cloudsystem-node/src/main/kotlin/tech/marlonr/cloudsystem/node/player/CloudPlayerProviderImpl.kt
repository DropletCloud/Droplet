package tech.marlonr.cloudsystem.node.player

import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement
import tech.marlonr.cloudsystem.api.player.ICloudPlayer
import tech.marlonr.cloudsystem.api.player.ICloudPlayerProvider
import tech.marlonr.cloudsystem.node.ApiAdapter
import tech.marlonr.cloudsystem.node.utils.managerHttpClient
import tech.marlonr.cloudsystem.node.utils.scope
import java.util.*
import java.util.concurrent.CompletableFuture

class CloudPlayerProviderImpl: ICloudPlayerProvider {
    val baseUrl = "https://localhost:8080" // TODO: variable in config file

    override fun getOnlinePlayers(): MutableList<CloudPlayerImpl> {
        var players: MutableList<CloudPlayerImpl>? = null
        scope.launch {
            val get = managerHttpClient.get("$baseUrl/players")
            players = Json.decodeFromString<MutableList<CloudPlayerImpl>>(get.bodyAsText())
        }
        return players ?: throw NullPointerException("Expression 'players' must not be null")
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