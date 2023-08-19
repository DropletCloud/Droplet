package tech.marlonr.cloudsystem.node

import tech.marlonr.cloudsystem.api.CloudAPI
import tech.marlonr.cloudsystem.api.group.ICloudGroupProvider
import tech.marlonr.cloudsystem.api.instance.ICloudInstanceProvider
import tech.marlonr.cloudsystem.api.node.ICloudNodeProvider
import tech.marlonr.cloudsystem.api.player.ICloudPlayerProvider

class ApiAdapter: CloudAPI() {

    override fun getGroupProvider(): ICloudGroupProvider {
        TODO("Not yet implemented")
    }

    override fun getInstanceProvider(): ICloudInstanceProvider {
        TODO("Not yet implemented")
    }

    override fun getCloudPlayerProvider(): ICloudPlayerProvider {
        TODO("Not yet implemented")
    }

    override fun getCloudNodeProvider(): ICloudNodeProvider {
        TODO("Not yet implemented")
    }
}