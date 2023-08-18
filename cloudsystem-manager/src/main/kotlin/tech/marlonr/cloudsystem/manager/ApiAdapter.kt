package tech.marlonr.cloudsystem.manager

import tech.marlonr.cloudsystem.api.CloudAPI
import tech.marlonr.cloudsystem.api.group.ICloudGroupProvider
import tech.marlonr.cloudsystem.api.instance.ICloudInstanceProvider
import tech.marlonr.cloudsystem.api.player.ICloudPlayerProvider
import tech.marlonr.cloudsystem.manager.group.CloudGroupProviderImpl
import tech.marlonr.cloudsystem.manager.instance.CloudInstanceProviderImpl
import tech.marlonr.cloudsystem.manager.player.CloudPlayerProviderImpl

class ApiAdapter: CloudAPI() {

    override fun getGroupProvider(): ICloudGroupProvider {
        return CloudGroupProviderImpl()
    }

    override fun getInstanceProvider(): ICloudInstanceProvider {
        return CloudInstanceProviderImpl()
    }

    override fun getCloudPlayerProvider(): ICloudPlayerProvider {
        return CloudPlayerProviderImpl()
    }
}