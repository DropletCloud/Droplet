package tech.marlonr.cloudsystem.node.utils.config

import kotlinx.serialization.Serializable

@Serializable
data class NodeConfig(
    val nodeName: String,
    val managerCommunicationRestBaseUrl: String,
    val managerCommunicationRestUser: String,
    val managerCommunicationRestToken: String,
    val communicationRestServiceHost: String,
    val communicationRestServicePort: Int,
    val communicationRestServiceUser: String,
    val instanceStartAddress: String
)
