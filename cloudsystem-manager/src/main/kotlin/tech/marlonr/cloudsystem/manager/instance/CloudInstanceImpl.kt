package tech.marlonr.cloudsystem.manager.instance

import tech.marlonr.cloudsystem.api.group.ICloudGroup
import tech.marlonr.cloudsystem.api.instance.ICloudInstance
import tech.marlonr.cloudsystem.api.instance.IServerInfo
import java.util.HashMap
import java.util.concurrent.CompletableFuture

class CloudInstanceImpl(
    private val name: String,
    private val id: String,
    private val port: Int,
    private val nodeName: String,
    private val group: ICloudGroup?
): ICloudInstance {
    val customProperties = hashMapOf<String, String>()

    override fun getName(): String {
        return name
    }

    override fun getId(): String {
        return id
    }

    override fun getPort(): Int {
        return port
    }

    override fun getNodeName(): String {
        return nodeName
    }

    override fun getGroupName(): String? {
        return (group ?: return null).name
    }

    override fun getGroup(): ICloudGroup? {
        return group
    }

    override fun getGroupAsync(): CompletableFuture<ICloudGroup?>? {
        return CompletableFuture.completedFuture(group)
    }

    override fun getCustomProperties(): HashMap<String, String> {
        return customProperties
    }

    override fun getServerInfo(): IServerInfo {
        TODO("Not yet implemented")
    }

    override fun start() {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

    override fun terminate() {
        TODO("Not yet implemented")
    }
}