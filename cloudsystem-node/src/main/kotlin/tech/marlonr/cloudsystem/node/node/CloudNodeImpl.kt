package tech.marlonr.cloudsystem.node.node

import tech.marlonr.cloudsystem.api.instance.ICloudInstance
import tech.marlonr.cloudsystem.api.node.ICloudNode

class CloudNodeImpl(
    @get:JvmName("kotlinGetName") val name: String,
    @get:JvmName("kotlinGetAddress") val address: String,
): ICloudNode {

    override fun getName(): String {
        return name
    }

    override fun getAddress(): String {
        return address
    }

    override fun getOnlineInstances(): MutableList<ICloudInstance> {
        TODO("Not yet implemented")
    }

    override fun disconnect() {
        TODO("Not yet implemented")
    }
}