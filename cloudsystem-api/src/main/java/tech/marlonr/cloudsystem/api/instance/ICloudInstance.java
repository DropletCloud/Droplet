package tech.marlonr.cloudsystem.api.instance;

import org.jetbrains.annotations.Nullable;
import tech.marlonr.cloudsystem.api.group.ICloudGroup;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;

/**
 * Server/Service instance
 */
public interface ICloudInstance {

    /**
     * @return the name of the instance
     */
    String getName();

    /**
     * @return The id of the instance
     */
    String getId();

    /**
     * @return The port of the instance
     */
    int getPort();

    /**
     * @return The name of the node where the instance is running
     */
    String getNodeName();

    /**
     * @return (nullable) the name of the group
     */
    @Nullable String getGroupName();

    /**
     * @return the group as {@link ICloudGroup}
     */
    @Nullable ICloudGroup getGroup();

    /**
     * @return the group as {@link CompletableFuture}
     */
    CompletableFuture<@Nullable ICloudGroup> getGroupAsync();

    /**
     * @return CustomProperties you can set
     */
    HashMap<String, String> getCustomProperties();

    /**
     * @return server info as {@link IServerInfo}
     */
    IServerInfo getServerInfo();

    /**
     * @return The status of the instance
     */
    InstanceStatus getInstanceStatus();

    /**
     * method to start the instance
     */
    void start();

    /**
     * method to stop the instance
     */
    void stop();

    /**
     * method to terminate/kill the instance
     */
    void terminate();
}
