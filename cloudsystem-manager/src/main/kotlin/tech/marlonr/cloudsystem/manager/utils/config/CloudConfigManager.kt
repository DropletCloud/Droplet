package tech.marlonr.cloudsystem.manager.utils.config

import kotlinx.serialization.encodeToString
import tech.marlonr.cloudsystem.manager.utils.json
import java.io.File
import java.util.concurrent.ThreadLocalRandom
import kotlin.streams.asSequence

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

            // @author https://www.baeldung.com/kotlin/random-alphanumeric-string
            val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')

            fun randomStringByJavaRandom() = ThreadLocalRandom.current()
                .ints(40.toLong(), 0, charPool.size)
                .asSequence()
                .map(charPool::get)
                .joinToString("")

            file.writeText(json.encodeToString(CloudConfig(8080, "user", randomStringByJavaRandom())))
        }

        config = json.decodeFromString<CloudConfig>(file.readText())
    }

    fun pushConfigToFile() {
        file.writeText(json.encodeToString(config))
    }
}