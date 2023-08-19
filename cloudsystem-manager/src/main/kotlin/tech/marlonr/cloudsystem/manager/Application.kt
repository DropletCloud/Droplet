package tech.marlonr.cloudsystem.manager

import tech.marlonr.cloudsystem.manager.ktor.KtorService

fun main() {
    val ktorService = KtorService("0.0.0.0", 8080) //TODO: config file

    ApiAdapter() // set instance for `CloudAPI`

    ktorService.start()
}