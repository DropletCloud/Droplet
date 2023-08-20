package tech.marlonr.cloudsystem.node.node

import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.launch
import tech.marlonr.cloudsystem.api.node.ICloudNode
import tech.marlonr.cloudsystem.api.node.ICloudNodeProvider
import tech.marlonr.cloudsystem.library.kotlin.ktor.params.RegisterNodeParams
import tech.marlonr.cloudsystem.node.utils.config.NodeConfigManager
import tech.marlonr.cloudsystem.node.utils.managerHttpClient
import tech.marlonr.cloudsystem.node.utils.scope

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