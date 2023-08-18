package tech.marlonr.cloudsystem.api.instance;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ICloudInstanceProvider {

    ICloudInstance getInstanceByName(String name);
    CompletableFuture<ICloudInstance> getInstanceByNameAsync();

    List<ICloudInstance> getInstances();
    CompletableFuture<List<ICloudInstance>> getInstancesAsync();

    void registerInstance(ICloudInstance cloudInstance);
    void unregisterInstance(ICloudInstance cloudInstance);
}
