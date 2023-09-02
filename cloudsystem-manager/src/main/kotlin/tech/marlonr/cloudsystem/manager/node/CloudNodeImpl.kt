package tech.marlonr.cloudsystem.manager.node

import tech.marlonr.cloudsystem.api.CloudAPI
import tech.marlonr.cloudsystem.api.instance.ICloudInstance
import tech.marlonr.cloudsystem.api.node.ICloudNode

class CloudNodeImpl(
    @get:JvmName("kotlinGetName") val name: String,
    @get:JvmName("kotlinGetAddress") val address: String
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
        CloudAPI.getInstance().cloudNodeProvider.unregisterNode(this)
    }
}