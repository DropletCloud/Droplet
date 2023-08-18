package tech.marlonr.cloudsystem.api.player;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface ICloudPlayerProvider {

    List<ICloudPlayer> getOnlinePlayers();
    ICloudPlayer getCloudPlayerByUUID(@NotNull UUID uuid);

    CompletableFuture<List<ICloudPlayer>> getOnlinePlayersAsync();
    CompletableFuture<ICloudPlayer> getCloudPlayerByUUIDAsync(@NotNull UUID uuid);

    void registerPlayer(@NotNull ICloudPlayer cloudPlayer);
    void unregisterPlayer(@NotNull ICloudPlayer cloudPlayer);
}
