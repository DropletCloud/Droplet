package tech.marlonr.cloudsystem.api.node;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Provider for cloud nodes
 */
public interface ICloudNodeProvider {

    /**
     * @return all online nodes
     */
    List<ICloudNode> getOnlineNodes();

    /**
     * register a node
     * @param node node you want to register
     */
    void registerNode(@NotNull ICloudNode node);

    /**
     * unregister a node
     * @param node node you want to unregister
     */
    void unregisterNode(@NotNull ICloudNode node);

    /**
     * unregister a node
     * @param name node you want to unregister
     */
    void unregisterNode(@NotNull String name);
}
