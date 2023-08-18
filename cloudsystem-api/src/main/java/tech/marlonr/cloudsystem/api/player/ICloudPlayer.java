package tech.marlonr.cloudsystem.api.player;

import tech.marlonr.cloudsystem.api.instance.ICloudInstance;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface ICloudPlayer {
    UUID getUUID();
    String getPlayerName();

    ICloudInstance getCurrentServer();
    CompletableFuture<ICloudInstance> getCurrentServerAsync();

    HashMap<String, String> getCustomProperties();
}
