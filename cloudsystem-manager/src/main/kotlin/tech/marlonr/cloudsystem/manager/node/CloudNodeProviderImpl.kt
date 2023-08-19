package tech.marlonr.cloudsystem.manager.node

import tech.marlonr.cloudsystem.api.node.ICloudNode
import tech.marlonr.cloudsystem.api.node.ICloudNodeProvider
import java.util.ArrayList

class CloudNodeProviderImpl: ICloudNodeProvider {

    override fun getOnlineNodes(): ArrayList<ICloudNode> {
        TODO("Not yet implemented")
    }
}