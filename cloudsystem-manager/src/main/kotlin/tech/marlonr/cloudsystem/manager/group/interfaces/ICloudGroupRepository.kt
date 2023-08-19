package tech.marlonr.cloudsystem.manager.group.interfaces

import tech.marlonr.cloudsystem.api.group.ICloudGroup

interface ICloudGroupRepository {

    fun getGroups(): List<ICloudGroup>
    fun getGroupByName(name: String): ICloudGroup?
    fun createGroup(group: ICloudGroup): ICloudGroup
    fun deleteGroup(group: ICloudGroup)
    fun deleteGroup(name: String)
}