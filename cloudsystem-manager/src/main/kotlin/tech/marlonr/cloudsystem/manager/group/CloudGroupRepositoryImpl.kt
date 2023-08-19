package tech.marlonr.cloudsystem.manager.group

import kotlinx.serialization.encodeToString
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import tech.marlonr.cloudsystem.api.group.ICloudGroup
import tech.marlonr.cloudsystem.manager.group.interfaces.ICloudGroupRepository
import tech.marlonr.cloudsystem.manager.utils.json
import java.io.File

class CloudGroupRepositoryImpl : ICloudGroupRepository {

    override fun getGroups(): List<ICloudGroup> {
        val files = File("groups/").listFiles() ?: return emptyList()

        return files.map { json.decodeFromString<CloudGroupImpl>(it.readText()) }
    }

    override fun getGroupByName(name: String): ICloudGroup? {
        val file = getFile(name)

        if (!file.exists()) return null

        return json.decodeFromString<CloudGroupImpl>(file.readText())
    }

    override fun createGroup(group: ICloudGroup): ICloudGroup {
        val file = getFile(group.name)

        if (!file.exists()) {
            file.createNewFile()

            val serialModule = SerializersModule {
                polymorphic(ICloudGroup::class) {
                }
            }

            file.writeText(json.encodeToString(CloudGroupImpl(group.name, group.minOnlineCount)))
        }
        return json.decodeFromString<CloudGroupImpl>(file.readText())
    }

    override fun deleteGroup(group: ICloudGroup) {
        getFile(group.name).delete()
    }

    override fun deleteGroup(name: String) {
        getFile(name).delete()
    }

    fun getFile(groupName: String): File {
        return File("groups/$groupName.json")
    }
}