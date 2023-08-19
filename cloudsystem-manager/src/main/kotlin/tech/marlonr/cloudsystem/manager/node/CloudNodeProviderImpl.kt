package tech.marlonr.cloudsystem.manager.node

import tech.marlonr.cloudsystem.api.node.ICloudNode
import tech.marlonr.cloudsystem.api.node.ICloudNodeProvider

class CloudNodeProviderImpl: ICloudNodeProvider {
    @get:JvmName("kotlinGetOnlineNodes") val onlineNodes = hashMapOf<String, ICloudNode>()

    override fun getOnlineNodes(): List<ICloudNode> {
        return onlineNodes.values.toList()
    }

    override fun registerNode(node: ICloudNode) {
        onlineNodes[node.name] = node
    }

    override fun unregisterNode(node: ICloudNode) {
        node.onlineInstances.forEach {
            it.stop()
        }
        onlineNodes.remove(node.name)
    }

    override fun unregisterNode(name: String) {
        onlineNodes[name]?.onlineInstances?.forEach {
            it.stop()
        }
        onlineNodes.remove(name)
    }
}