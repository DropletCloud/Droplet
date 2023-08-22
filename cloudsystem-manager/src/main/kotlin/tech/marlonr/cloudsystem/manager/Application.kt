package tech.marlonr.cloudsystem.manager

import tech.marlonr.cloudsystem.manager.ktor.KtorService
import tech.marlonr.cloudsystem.manager.utils.config.CloudConfigManager
import tech.marlonr.cloudsystem.manager.utils.logger
import kotlin.concurrent.thread

object Application {
    private val ktorService = KtorService(CloudConfigManager.getConfig().communicationRestServiceHost, CloudConfigManager.getConfig().communicationRestServicePort)

    @JvmStatic
    fun main(args: Array<String>) {
        logger.success("Welcome to the CloudSystem!")
        ApiAdapter() // set instance for `CloudAPI`

        // SHUTDOWN HOOK
        //TODO: fix error Runtime.getRuntime().addShutdownHook(shutdown())

        ktorService.start()
    }

    private fun shutdown(): Thread = thread {
        ktorService.stop()
    }
}