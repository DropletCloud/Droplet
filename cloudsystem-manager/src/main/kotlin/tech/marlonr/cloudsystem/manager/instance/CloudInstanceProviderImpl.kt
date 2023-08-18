package tech.marlonr.cloudsystem.manager.instance

import tech.marlonr.cloudsystem.api.instance.ICloudInstance
import tech.marlonr.cloudsystem.api.instance.ICloudInstanceProvider
import java.util.concurrent.CompletableFuture

class CloudInstanceProviderImpl: ICloudInstanceProvider {

    override fun getInstanceByName(name: String): ICloudInstance {
        TODO("Not yet implemented")
    }

    override fun getInstanceByNameAsync(): CompletableFuture<ICloudInstance> {
        TODO("Not yet implemented")
    }

    override fun getInstances(): MutableList<ICloudInstance> {
        TODO("Not yet implemented")
    }

    override fun getInstancesAsync(): CompletableFuture<MutableList<ICloudInstance>> {
        TODO("Not yet implemented")
    }

    override fun registerInstance(cloudInstance: ICloudInstance?) {
        TODO("Not yet implemented")
    }

    override fun unregisterInstance(cloudInstance: ICloudInstance?) {
        TODO("Not yet implemented")
    }
}