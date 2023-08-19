package tech.marlonr.cloudsystem.manager.ktor.routes.params

import kotlinx.serialization.Serializable

@Serializable
data class RegisterNodeParams(
    val name: String,
    val address: String,
    val restCommunicationPort: Int,
    val restUserName: String,
    val restToken: String
)
