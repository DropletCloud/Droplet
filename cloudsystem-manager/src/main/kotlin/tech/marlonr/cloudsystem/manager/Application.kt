package tech.marlonr.cloudsystem.manager

import tech.marlonr.cloudsystem.manager.ktor.KtorService
import tech.marlonr.cloudsystem.manager.utils.config.CloudConfigManager

fun main() {
    val ktorService = KtorService(CloudConfigManager.getConfig().communicationRestServiceHost, CloudConfigManager.getConfig().communicationRestServicePort)

    ApiAdapter() // set instance for `CloudAPI`

    ktorService.start()
}