package tech.marlonr.cloudsystem.api.node;

import org.jetbrains.annotations.NotNull;
import tech.marlonr.cloudsystem.api.instance.ICloudInstance;

import java.util.List;

/**
 * `Cloud Node` where e.g. instances are running
 */
public interface ICloudNode {

    /**
     * @return The name of the Node
     */
    @NotNull String getName();

    /**
     * @return The IP address of the node
     */
    @NotNull String getAddress();

    /**
     * @return all online instances
     */
    List<ICloudInstance> getOnlineInstances();

    /**
     * disconnect the {@link ICloudNode}
     */
    void disconnect();
}
