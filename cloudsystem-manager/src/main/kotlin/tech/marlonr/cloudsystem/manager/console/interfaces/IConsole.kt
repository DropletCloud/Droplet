package tech.marlonr.cloudsystem.manager.console.interfaces

interface IConsole {
    //TODO: prompts

    fun getLogger(): ILogger
    fun getInputHandler(): IInputHandler
}