package tech.marlonr.cloudsystem.manager.ktor

import io.ktor.server.application.*
import io.ktor.server.auth.*
import tech.marlonr.cloudsystem.manager.utils.config.CloudConfigManager

fun Application.configureAuth() {
    //TODO
    install(Authentication) {
        basic("auth-basic") {
            realm = "Access to the '/' path"
            validate { credentials ->
                if (credentials.name == CloudConfigManager.getConfig().communicationRestServiceUser && credentials.password == CloudConfigManager.getConfig().communicationRestServiceToken) {
                    UserIdPrincipal(credentials.name)
                } else {
                    null
                }
            }
        }
    }
}