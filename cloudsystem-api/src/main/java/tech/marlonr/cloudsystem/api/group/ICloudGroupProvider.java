package tech.marlonr.cloudsystem.api.group;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ICloudGroupProvider {

    ICloudGroup getGroupByName(@NotNull String name);

    List<ICloudGroup> getGroups();

    CompletableFuture<ICloudGroup> getGroupByNameAsync(@NotNull String name);
    CompletableFuture<List<ICloudGroup>> getGroupsAsync();

    void createGroup(@NotNull ICloudGroup group);
    void deleteGroup(@NotNull ICloudGroup group);
}
