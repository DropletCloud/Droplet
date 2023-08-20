package tech.marlonr.cloudsystem.node.node

import tech.marlonr.cloudsystem.api.node.ICloudNode
import tech.marlonr.cloudsystem.api.node.ICloudNodeProvider

class CloudNodeProviderImpl: ICloudNodeProvider {

    override fun getOnlineNodes(): MutableList<ICloudNode> {
        TODO("Not yet implemented")
    }

    override fun registerNode(node: ICloudNode) {
        TODO("Not yet implemented")
    }

    override fun unregisterNode(node: ICloudNode) {
        TODO("Not yet implemented")
    }

    override fun unregisterNode(name: String) {
        TODO("Not yet implemented")
    }
}