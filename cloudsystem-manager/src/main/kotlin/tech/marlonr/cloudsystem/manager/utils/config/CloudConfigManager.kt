package tech.marlonr.cloudsystem.manager.utils.config

import kotlinx.serialization.encodeToString
import tech.marlonr.cloudsystem.library.kotlin.utils.randomStringByJavaRandom
import tech.marlonr.cloudsystem.manager.utils.json
import java.io.File

object CloudConfigManager {
    private val file = File("config.json")
    @get:JvmName("kotlinGetConfig") var config: CloudConfig? = null

    fun getConfig(): CloudConfig {
        if (config == null) {
            pullConfigFromFile()
            return config!!
        }
        return config!!
    }

    fun pullConfigFromFile() {
        if (!file.exists()) {
            file.createNewFile()
            file.writeText(json.encodeToString(CloudConfig("127.0.0.1", 8080, "user", randomStringByJavaRandom())))
        }
        config = json.decodeFromString<CloudConfig>(file.readText())
    }

    fun pushConfigToFile() {
        file.writeText(json.encodeToString(config))
    }
}