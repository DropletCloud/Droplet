package tech.marlonr.cloudsystem.manager.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.serialization.json.Json
import tech.marlonr.cloudsystem.manager.console.ConsoleImpl
import tech.marlonr.cloudsystem.manager.console.interfaces.IConsole
import tech.marlonr.cloudsystem.manager.console.interfaces.ILogger

val json = Json {
    prettyPrint = true
}

val console: IConsole = ConsoleImpl()
val logger: ILogger = console.getLogger()

val scope = CoroutineScope(Dispatchers.IO)