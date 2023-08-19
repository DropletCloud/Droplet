package tech.marlonr.cloudsystem.manager.group

import tech.marlonr.cloudsystem.api.group.ICloudGroup
import tech.marlonr.cloudsystem.api.group.ICloudGroupProvider
import tech.marlonr.cloudsystem.manager.group.interfaces.ICloudGroupRepository
import java.util.concurrent.CompletableFuture

class CloudGroupProviderImpl: ICloudGroupProvider {

    val repository: ICloudGroupRepository = CloudGroupRepositoryImpl()

    override fun getGroupByName(name: String): ICloudGroup? {
        return repository.getGroupByName(name)
    }

    override fun getGroups(): MutableList<ICloudGroup> {
        return repository.getGroups().toMutableList()
    }

    override fun getGroupByNameAsync(name: String): CompletableFuture<ICloudGroup> {
        return CompletableFuture.completedFuture(repository.getGroupByName(name))
    }

    override fun getGroupsAsync(): CompletableFuture<MutableList<ICloudGroup>> {
        return CompletableFuture.completedFuture(repository.getGroups().toMutableList())
    }

    override fun createGroup(group: ICloudGroup) {
        repository.createGroup(group)
    }

    override fun deleteGroup(group: ICloudGroup) {
        repository.deleteGroup(group)
    }
}