package tech.marlonr.cloudsystem.api.instance;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Provider for Cloud Instances
 */
public interface ICloudInstanceProvider {

    /**
     * @param name name of the instance
     * @return The instance as {@link ICloudInstance}
     */
    ICloudInstance getInstanceByName(String name);

    /**
     * @param name name of the instance
     * @return The instance as {@link CompletableFuture}
     */
    CompletableFuture<ICloudInstance> getInstanceByNameAsync(String name);

    /**
     * @return all registered instances
     */
    List<ICloudInstance> getInstances();

    /**
     * @return all registered instances as {@link CompletableFuture}
     */
    CompletableFuture<List<ICloudInstance>> getInstancesAsync();

    /**
     * register an {@link ICloudInstance}
     * @param cloudInstance instance you want to register
     */
    void registerInstance(@NotNull ICloudInstance cloudInstance);

    /**
     * unregister an {@link ICloudInstance}
     * @param cloudInstance instance you want to unregister
     */
    void unregisterInstance(@NotNull ICloudInstance cloudInstance);
}
