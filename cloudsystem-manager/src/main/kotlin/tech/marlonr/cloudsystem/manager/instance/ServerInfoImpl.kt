package tech.marlonr.cloudsystem.manager.instance

import tech.marlonr.cloudsystem.api.instance.IServerInfo

class ServerInfoImpl(
    @get:JvmName("kotlinGetOnlinePlayers") var onlinePlayers: Int
): IServerInfo {

    override fun getOnlinePlayers(): Int {
        return onlinePlayers
    }
}