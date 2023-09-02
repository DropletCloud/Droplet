package tech.marlonr.cloudsystem.manager.console

import com.github.ajalt.mordant.rendering.TextColors
import com.github.ajalt.mordant.rendering.TextStyles
import tech.marlonr.cloudsystem.manager.console.interfaces.ILogger

class LoggerImpl: ILogger {
    private val prefix = "${TextStyles.bold("${TextColors.brightCyan("Droplet")}${TextColors.brightWhite("Cloud")}")} ${TextColors.gray("» ")}"

    override fun getPrompt(): String {
        return "${TextStyles.bold("${TextColors.brightRed("manager")}${TextColors.gray("@")}${TextColors.brightCyan("cloudsystem")}")} ${TextColors.gray("»")}"
    }

    override fun info(message: String) {
        print("\r")
        println("$prefix ${TextColors.brightMagenta("LOG")} – $message")
        print("\n")
        sendPrompt()
    }

    override fun success(message: String) {
        print("\r")
        print("$prefix ${TextColors.brightGreen("SUCCESS")} – ${TextColors.green(message)}")
        print("\n")
        sendPrompt()
    }

    override fun warning(message: String) {
        print("\r")
        println("$prefix ${TextColors.brightYellow("WARNING")} – ${TextColors.yellow(message)}")
        print("\n")
        sendPrompt()
    }

    override fun error(message: String) {
        print("\r")
        println("$prefix ${TextColors.brightRed("ERROR")} – ${TextColors.red(message)}")
        print("\n")
        sendPrompt()
    }
}