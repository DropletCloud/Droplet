package tech.marlonr.cloudsystem.api.node;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ICloudNodeProvider {

    List<ICloudNode> getOnlineNodes();

    void registerNode(@NotNull ICloudNode node);
    void unregisterNode(@NotNull ICloudNode node);
    void unregisterNode(@NotNull String name);
}
