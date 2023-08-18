package tech.marlonr.cloudsystem.api.group;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ICloudGroupProvider {

    ICloudGroup getGroupByName(String name);

    List<ICloudGroup> getGroups();

    CompletableFuture<ICloudGroup> getGroupByNameAsync();
    CompletableFuture<List<ICloudGroup>> getGroupsAsync();

    void createGroup(ICloudGroup group);
    void deleteGroup(ICloudGroup group);
}
