package tech.marlonr.cloudsystem.manager

import tech.marlonr.cloudsystem.manager.ktor.KtorService
import tech.marlonr.cloudsystem.manager.utils.config.CloudConfigManager
import tech.marlonr.cloudsystem.manager.utils.console
import tech.marlonr.cloudsystem.manager.utils.logger
import kotlin.concurrent.thread

object Application {
    private val ktorService = KtorService(CloudConfigManager.getConfig().communicationRestServiceHost, CloudConfigManager.getConfig().communicationRestServicePort)

    @JvmStatic
    fun main(args: Array<String>) {
        ApiAdapter() // set instance for `CloudAPI`

        // SHUTDOWN HOOK
        //TODO: fix error Runtime.getRuntime().addShutdownHook(shutdown())

        logger.success("Welcome to DropletCloud!")
        console.getInputHandler().run()

        ktorService.start()
    }

    private fun shutdown(): Thread = thread {
        ktorService.stop()
    }
}