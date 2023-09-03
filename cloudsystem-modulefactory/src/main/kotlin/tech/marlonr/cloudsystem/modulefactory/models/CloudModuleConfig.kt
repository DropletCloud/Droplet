package tech.marlonr.cloudsystem.modulefactory.models

import kotlinx.serialization.Serializable

@Serializable
data class CloudModuleConfig(
    val name: String,
    val version: String,
    val authors: List<String>,
    val mainClass: String
)