package tech.marlonr.cloudsystem.modulefactory

import java.io.File

class ModuleFactory(
    private val moduleFolder: File
) {
    fun initialize() {
        if (!moduleFolder.exists()) moduleFolder.mkdirs()
    }
}