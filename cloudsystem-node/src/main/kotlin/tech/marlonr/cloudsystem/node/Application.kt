package tech.marlonr.cloudsystem.node

import tech.marlonr.cloudsystem.api.CloudAPI
import tech.marlonr.cloudsystem.node.ktor.token
import tech.marlonr.cloudsystem.node.node.CloudNodeImpl
import tech.marlonr.cloudsystem.node.utils.config.NodeConfigManager

fun main() {
    ApiAdapter() // set instance for `CloudAPI`

    with(NodeConfigManager.getConfig()) {
        CloudAPI.getInstance().cloudNodeProvider.registerNode(CloudNodeImpl(nodeName, communicationRestServiceHost, communicationRestServicePort, communicationRestServiceUser, token))
    }
}