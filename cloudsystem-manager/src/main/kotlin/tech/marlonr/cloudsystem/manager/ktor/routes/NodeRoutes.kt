package tech.marlonr.cloudsystem.manager.ktor.routes

import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.request.*
import io.ktor.server.routing.*
import tech.marlonr.cloudsystem.api.CloudAPI
import tech.marlonr.cloudsystem.library.kotlin.ktor.params.RegisterNodeParams
import tech.marlonr.cloudsystem.manager.node.CloudNodeImpl

fun Application.configureNodeRoutes() {
    routing {
        route("/node") {
            authenticate {
                post("/register") {
                    val params = call.receive<RegisterNodeParams>()

                    CloudAPI.getInstance().cloudNodeProvider.registerNode(CloudNodeImpl(
                        params.name,
                        params.address,
                        params.restCommunicationPort,
                        params.restUserName,
                        params.restToken
                    ))
                }
                post("/{name}/unregister") {
                    val name = call.parameters["name"]
                    CloudAPI.getInstance().cloudNodeProvider.unregisterNode(name!!)
                }
            }
        }
    }
}