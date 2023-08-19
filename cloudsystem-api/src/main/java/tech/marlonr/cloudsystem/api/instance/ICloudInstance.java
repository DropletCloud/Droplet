package tech.marlonr.cloudsystem.api.instance;

import org.jetbrains.annotations.Nullable;
import tech.marlonr.cloudsystem.api.group.ICloudGroup;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

public interface ICloudInstance {

    String getName();
    String getId();
    int getPort();
    String getNodeName();
    @Nullable String getGroupName();
    @Nullable ICloudGroup getGroup();
    CompletableFuture<@Nullable ICloudGroup> getGroupAsync();
    HashMap<String, String> getCustomProperties();
    IServerInfo getServerInfo();
    InstanceStatus getInstanceStatus();

    void start();
    void stop();
    void terminate();
}
