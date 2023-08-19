package tech.marlonr.cloudsystem.node.utils.config

import kotlinx.serialization.encodeToString
import tech.marlonr.cloudsystem.node.utils.json
import java.io.File

object NodeConfigManager {
    private val file = File("config.json")
    @get:JvmName("kotlinGetConfig") var config: NodeConfig? = null

    fun getConfig(): NodeConfig {
        if (config == null) {
            pullConfigFromFile()
            return config!!
        }
        return config!!
    }

    fun pullConfigFromFile() {
        if (!file.exists()) {
            file.createNewFile()

            file.writeText(json.encodeToString(NodeConfig(
                nodeName = "Node-1",
                managerCommunicationRestBaseUrl = "https://localhost:8080",
                managerCommunicationRestUser = "user",
                managerCommunicationRestToken = "pwhere",
                communicationRestServiceHost = "127.0.0.1",
                communicationRestServicePort = 9090,
                communicationRestServiceUser = "user",
                instanceStartAddress = "127.0.0.1"
            )))
        }

        config = json.decodeFromString<NodeConfig>(file.readText())
    }

    fun pushConfigToFile() {
        file.writeText(json.encodeToString(config))
    }
}