package tech.marlonr.cloudsystem.manager.console.interfaces

interface ILogger {
    fun getPrompt(): String
    fun log(message: String)
    fun success(message: String)
    fun warning(message: String)
    fun error(message: String)

    fun sendPrompt() {
        print(getPrompt())
    }
}