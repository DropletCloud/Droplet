package tech.marlonr.cloudsystem.api.instance;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ICloudInstanceProvider {

    ICloudInstance getInstanceByName(String name);
    CompletableFuture<ICloudInstance> getInstanceByNameAsync(String name);

    List<ICloudInstance> getInstances();
    CompletableFuture<List<ICloudInstance>> getInstancesAsync();

    void registerInstance(@NotNull ICloudInstance cloudInstance);
    void unregisterInstance(@NotNull ICloudInstance cloudInstance);
}
