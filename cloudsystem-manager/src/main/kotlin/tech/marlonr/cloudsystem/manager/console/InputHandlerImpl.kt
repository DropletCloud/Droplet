package tech.marlonr.cloudsystem.manager.console

import com.mojang.brigadier.CommandDispatcher
import kotlinx.coroutines.launch
import tech.marlonr.cloudsystem.manager.console.interfaces.IInputHandler
import tech.marlonr.cloudsystem.manager.console.interfaces.ILogger
import tech.marlonr.cloudsystem.manager.utils.scope

class InputHandlerImpl(private val logger: ILogger): IInputHandler {
    val dispatcher = CommandDispatcher<String>()

    override var commandInputEnabled = true

    override fun run() {
        scope.launch {
            while (true) {
                while (commandInputEnabled) {
                    runCatching {
                        handleCommandInput(readln())
                    }.onFailure {
                        logger.error(it.stackTraceToString())
                    }
                }
            }
        }.start()
    }

    override fun handleCommandInput(input: String) {
        dispatcher.execute(input, "console")
    }
}