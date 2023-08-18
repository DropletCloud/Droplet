package tech.marlonr.cloudsystem.manager.instance

import tech.marlonr.cloudsystem.api.instance.IServerInfo

class ServerInfoImpl(
    var onlinePlayers: Int
): IServerInfo {

    override fun getOnlinePlayers(): Int {
        return onlinePlayers
    }
}