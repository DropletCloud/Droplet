package tech.marlonr.cloudsystem.manager.console.interfaces

interface IInputHandler {
    var commandInputEnabled: Boolean

    fun run()
    fun handleCommandInput(input: String)
}