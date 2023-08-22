package tech.marlonr.cloudsystem.manager.console.interfaces

interface IConsole {

    fun getLogger(): ILogger
    fun getInputHandler(): IInputHandler
}