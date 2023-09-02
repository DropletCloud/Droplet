package tech.marlonr.cloudsystem.manager.console.interfaces

import com.mojang.brigadier.CommandDispatcher

interface IInputHandler {
    var commandInputEnabled: Boolean

    fun run()
    fun handleCommandInput(input: String)
    fun getDispatcher(): CommandDispatcher<String>
}