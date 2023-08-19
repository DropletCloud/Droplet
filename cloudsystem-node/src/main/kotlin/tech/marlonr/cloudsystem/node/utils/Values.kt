package tech.marlonr.cloudsystem.node.utils

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.serialization.json.Json

val scope = CoroutineScope(Dispatchers.IO)

val json = Json {
    prettyPrint = true
}