package tech.marlonr.cloudsystem.api.player;

import tech.marlonr.cloudsystem.api.instance.ICloudInstance;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface ICloudPlayer {
    UUID getUUID();
    String getPlayerName();

    ICloudInstance getCurrentProxy();
    ICloudInstance getCurrentServer();
    CompletableFuture<ICloudInstance> getCurrentProxyAsync();
    CompletableFuture<ICloudInstance> getCurrentServerAsync();
    String getIpAddress();
    HashMap<String, String> getCustomProperties();
    void sendMessage(String message);
    void sendMiniMessage(String miniMessage);
    void kick(String message);
    void sendToInstance(String serverName);
    void sendToInstance(ICloudInstance instance);
}