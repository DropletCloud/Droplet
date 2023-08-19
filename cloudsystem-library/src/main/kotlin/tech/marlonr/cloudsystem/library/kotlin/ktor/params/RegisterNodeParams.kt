package tech.marlonr.cloudsystem.library.kotlin.ktor.params

import kotlinx.serialization.Serializable

@Serializable
data class RegisterNodeParams(
    val name: String,
    val address: String,
    val restCommunicationPort: Int,
    val restUserName: String,
    val restToken: String
)
