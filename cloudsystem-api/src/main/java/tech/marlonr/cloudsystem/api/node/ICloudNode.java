package tech.marlonr.cloudsystem.api.node;

import org.jetbrains.annotations.NotNull;
import tech.marlonr.cloudsystem.api.instance.ICloudInstance;

import java.util.List;

public interface ICloudNode {

    @NotNull String getName();
    @NotNull String getAddress();
    @NotNull Integer getRestCommunicationPort();
    @NotNull String getRestUserName();
    @NotNull String getRestToken();

    List<ICloudInstance> getOnlineInstances();

    void disconnect();
}
