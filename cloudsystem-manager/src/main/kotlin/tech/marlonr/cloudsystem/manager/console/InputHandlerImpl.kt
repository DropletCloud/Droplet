package tech.marlonr.cloudsystem.manager.console

import com.mojang.brigadier.CommandDispatcher
import com.mojang.brigadier.exceptions.CommandSyntaxException
import kotlinx.coroutines.launch
import tech.marlonr.cloudsystem.manager.console.interfaces.IInputHandler
import tech.marlonr.cloudsystem.manager.console.interfaces.ILogger
import tech.marlonr.cloudsystem.manager.utils.scope

class InputHandlerImpl(private val logger: ILogger): IInputHandler {
    private val dispatcher = CommandDispatcher<String>()

    override var commandInputEnabled = true

    override fun run() {
        scope.launch {
            while (true) {
                while (commandInputEnabled) {
                    runCatching {
                        handleCommandInput(readln())
                    }.onFailure {
                        if (it is CommandSyntaxException) {
                            logger.error(if (it.message == null) "" else it.message!!)
                            return@onFailure
                        } else {
                            logger.error(it.stackTraceToString())
                        }
                    }
                }
            }
        }.start()
    }

    override fun handleCommandInput(input: String) {
        dispatcher.execute(input, "console")
    }

    override fun getDispatcher(): CommandDispatcher<String> {
        return dispatcher
    }
}