package tech.marlonr.cloudsystem.manager.instance

import tech.marlonr.cloudsystem.api.instance.ICloudInstance
import tech.marlonr.cloudsystem.api.instance.ICloudInstanceProvider
import java.util.concurrent.CompletableFuture

class CloudInstanceProviderImpl: ICloudInstanceProvider {

    val onlineInstances = hashMapOf<String, ICloudInstance>()

    override fun getInstanceByName(name: String): ICloudInstance? {
        return onlineInstances[name]
    }

    override fun getInstanceByNameAsync(name: String): CompletableFuture<ICloudInstance?> {
        return CompletableFuture.completedFuture(onlineInstances[name])
    }

    override fun getInstances(): MutableList<ICloudInstance> {
        return onlineInstances.values.toMutableList()
    }

    override fun getInstancesAsync(): CompletableFuture<MutableList<ICloudInstance>> {
        return CompletableFuture.completedFuture(onlineInstances.values.toMutableList())
    }

    override fun registerInstance(cloudInstance: ICloudInstance) {
        onlineInstances[cloudInstance.name] = cloudInstance
        cloudInstance.start()
    }

    override fun unregisterInstance(cloudInstance: ICloudInstance) {
        cloudInstance.stop()
        onlineInstances.remove(cloudInstance.name)
    }
}