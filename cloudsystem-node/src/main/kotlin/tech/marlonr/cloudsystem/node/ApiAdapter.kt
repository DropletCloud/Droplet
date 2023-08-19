package tech.marlonr.cloudsystem.node

import tech.marlonr.cloudsystem.api.CloudAPI
import tech.marlonr.cloudsystem.api.group.ICloudGroupProvider
import tech.marlonr.cloudsystem.api.instance.ICloudInstanceProvider
import tech.marlonr.cloudsystem.api.node.ICloudNodeProvider
import tech.marlonr.cloudsystem.api.player.ICloudPlayerProvider
import tech.marlonr.cloudsystem.node.node.CloudNodeProviderImpl
import tech.marlonr.cloudsystem.node.player.CloudPlayerProviderImpl

class ApiAdapter: CloudAPI() {

    override fun getGroupProvider(): ICloudGroupProvider {
        TODO("Not yet implemented")
    }

    override fun getInstanceProvider(): ICloudInstanceProvider {
        TODO("Not yet implemented")
    }

    override fun getCloudPlayerProvider(): ICloudPlayerProvider {
        return CloudPlayerProviderImpl()
    }

    override fun getCloudNodeProvider(): ICloudNodeProvider {
        return CloudNodeProviderImpl()
    }
}