package tech.marlonr.cloudsystem.manager.group

import tech.marlonr.cloudsystem.api.group.ICloudGroup

class CloudGroupImpl(
    val name: String,
    var minOnlineCount: Int
): ICloudGroup {

    override fun getName(): String {
        return name
    }

    override fun getMinOnlineCount(): Int {
        return minOnlineCount
    }
}