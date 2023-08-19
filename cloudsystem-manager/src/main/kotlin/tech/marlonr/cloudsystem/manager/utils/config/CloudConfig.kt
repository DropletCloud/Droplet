package tech.marlonr.cloudsystem.manager.utils.config

import kotlinx.serialization.Serializable

@Serializable
data class CloudConfig(
    val communicationRestServicePort: Int,
    val communicationRestServiceUser: String,
    val communicationRestServiceToken: String
)