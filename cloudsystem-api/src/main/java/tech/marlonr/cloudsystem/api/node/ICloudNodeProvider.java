package tech.marlonr.cloudsystem.api.node;

import java.util.ArrayList;

public interface ICloudNodeProvider {

    ArrayList<ICloudNode> getOnlineNodes();
}
