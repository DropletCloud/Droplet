package tech.marlonr.cloudsystem.manager.group

import tech.marlonr.cloudsystem.api.group.ICloudGroup
import tech.marlonr.cloudsystem.api.group.ICloudGroupProvider
import java.util.concurrent.CompletableFuture

class CloudGroupProviderImpl: ICloudGroupProvider {

    override fun getGroupByName(name: String?): ICloudGroup {
        TODO("Not yet implemented")
    }

    override fun getGroups(): MutableList<ICloudGroup> {
        TODO("Not yet implemented")
    }

    override fun getGroupByNameAsync(): CompletableFuture<ICloudGroup> {
        TODO("Not yet implemented")
    }

    override fun getGroupsAsync(): CompletableFuture<MutableList<ICloudGroup>> {
        TODO("Not yet implemented")
    }

    override fun createGroup(group: ICloudGroup?) {
        TODO("Not yet implemented")
    }

    override fun deleteGroup(group: ICloudGroup?) {
        TODO("Not yet implemented")
    }
}