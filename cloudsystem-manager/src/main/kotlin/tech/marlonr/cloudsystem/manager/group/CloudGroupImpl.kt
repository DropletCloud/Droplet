package tech.marlonr.cloudsystem.manager.group

import kotlinx.serialization.Serializable
import tech.marlonr.cloudsystem.api.group.ICloudGroup

@Serializable
class CloudGroupImpl(
    @get:JvmName("kotlinGetName") val name: String,
    @get:JvmName("kotlinGetMinOnlineCount") var minOnlineCount: Int
): ICloudGroup {

    override fun getName(): String {
        return name
    }

    override fun getMinOnlineCount(): Int {
        return minOnlineCount
    }
}