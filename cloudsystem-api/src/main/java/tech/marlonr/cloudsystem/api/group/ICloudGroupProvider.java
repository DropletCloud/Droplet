package tech.marlonr.cloudsystem.api.group;

import org.jetbrains.annotations.NotNull;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Provider for Cloud Groups
 */
public interface ICloudGroupProvider {

    /**
     * @param name the name of the group
     * @return {@link tech.marlonr.cloudsystem.api.group.ICloudGroup}
     */
    ICloudGroup getGroupByName(@NotNull String name);

    /**
     * @return all existing groups
     */
    List<ICloudGroup> getGroups();

    /**
     * @param name name of the group
     * @return {@link CompletableFuture<ICloudGroup>}
     */
    CompletableFuture<ICloudGroup> getGroupByNameAsync(@NotNull String name);

    /**
     * @return all existing groups as {@link CompletableFuture}
     */
    CompletableFuture<List<ICloudGroup>> getGroupsAsync();

    /**
     * Create a {@link ICloudGroup}
     * @param group the group that should be created
     */
    void createGroup(@NotNull ICloudGroup group);

    /**
     * Create a {@link ICloudGroup}
     * @param group the group that should be deleted
     */
    void deleteGroup(@NotNull ICloudGroup group);
}
