package tech.marlonr.cloudsystem.node.utils

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.auth.*
import io.ktor.client.plugins.auth.providers.*

val managerHttpClient = HttpClient(CIO) {
    install(Auth) {
        basic {
            credentials {
                BasicAuthCredentials(username = "jetbrains", password = "foobar") //TODO
            }
            realm = "Access to the '/' path"
        }
    }
}