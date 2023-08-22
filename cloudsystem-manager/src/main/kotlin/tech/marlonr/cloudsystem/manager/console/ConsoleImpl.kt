package tech.marlonr.cloudsystem.manager.console

import tech.marlonr.cloudsystem.manager.console.interfaces.IConsole
import tech.marlonr.cloudsystem.manager.console.interfaces.ILogger

class ConsoleImpl: IConsole {

    override fun getLogger(): ILogger {
        return LoggerImpl()
    }
}