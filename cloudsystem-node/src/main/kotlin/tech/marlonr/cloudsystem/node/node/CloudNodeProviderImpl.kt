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
    val baseUrl = NodeConfigManager.getConfig().managerCommunicationRestBaseUrl

    override fun getOnlineNodes(): MutableList<ICloudNode> {
        TODO("Not yet implemented")
    }

    override fun registerNode(node: ICloudNode) {
        scope.launch {
            managerHttpClient.post("$baseUrl/node/register") {
                contentType(ContentType.Application.Json)
                setBody(RegisterNodeParams(node.name, node.address, node.restCommunicationPort, node.restUserName, node.restToken))
            }
        }
    }

    override fun unregisterNode(node: ICloudNode) {
        TODO("Not yet implemented")
    }

    override fun unregisterNode(name: String) {
        TODO("Not yet implemented")
    }
}