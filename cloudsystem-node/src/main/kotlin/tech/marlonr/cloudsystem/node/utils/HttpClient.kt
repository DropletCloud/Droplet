package tech.marlonr.cloudsystem.node.utils

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.auth.*
import io.ktor.client.plugins.auth.providers.*
import tech.marlonr.cloudsystem.node.utils.config.NodeConfigManager

val managerHttpClient = HttpClient(CIO) {
    install(Auth) {
        basic {
            credentials {
                BasicAuthCredentials(username = NodeConfigManager.getConfig().managerCommunicationRestUser, password = NodeConfigManager.getConfig().managerCommunicationRestToken)
            }
            realm = "Access to the '/' path"
        }
    }
}