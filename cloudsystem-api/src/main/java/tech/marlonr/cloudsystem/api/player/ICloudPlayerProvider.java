package tech.marlonr.cloudsystem.api.player;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * provider for cloud players
 */
public interface ICloudPlayerProvider {

    /**
     * @return all online cloud players
     */
    List<ICloudPlayer> getOnlinePlayers();

    /**
     * @param uuid uuid of the player
     * @return {@link ICloudPlayer}
     */
    ICloudPlayer getCloudPlayerByUUID(@NotNull UUID uuid);

    /**
     * @return all online cloud players as {@link CompletableFuture<List<ICloudPlayer>>}
     */
    CompletableFuture<List<ICloudPlayer>> getOnlinePlayersAsync();

    /**
     * @param uuid uuid of the player
     * @return {@link CompletableFuture<ICloudPlayer>}
     */
    CompletableFuture<ICloudPlayer> getCloudPlayerByUUIDAsync(@NotNull UUID uuid);

    /**
     * method to register cloud players
     * @param cloudPlayer the cloud player you want to register
     */
    void registerPlayer(@NotNull ICloudPlayer cloudPlayer);

    /**
     * method to unregister cloud players
     * @param cloudPlayer the cloud player you want to unregister
     */
    void unregisterPlayer(@NotNull ICloudPlayer cloudPlayer);
}
