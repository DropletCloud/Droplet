package tech.marlonr.cloudsystem.api.player;

import tech.marlonr.cloudsystem.api.instance.ICloudInstance;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * {@link ICloudPlayer} is a wrapper to communicate with online minecraft players
 */
public interface ICloudPlayer {
    /**
     * @return unique id of the Minecraft player
     */
    UUID getUUID();

    /**
     * @return The name of the Minecraft player
     */
    String getPlayerName();

    /**
     * @return current proxy of the Minecraft player
     */
    ICloudInstance getCurrentProxy();

    /**
     * @return current server of the Minecraft player
     */
    ICloudInstance getCurrentServer();

    /**
     * @return current proxy of the Minecraft player as {@link CompletableFuture}
     */
    CompletableFuture<ICloudInstance> getCurrentProxyAsync();

    /**
     * @return current server of the Minecraft player as {@link CompletableFuture}
     */
    CompletableFuture<ICloudInstance> getCurrentServerAsync();

    /**
     * @return IP address of the (Minecraft) player
     */
    String getIpAddress();

    /**
     * @return custom properties of the player
     */
    HashMap<String, String> getCustomProperties();

    /**
     * method to send a minecraft player a chat message
     * @param message chat message you want to send
     */
    void sendMessage(String message);

    /**
     * method to send a minecraft player a chat MiniMessage
     * @param miniMessage chat MiniMessage you want to send
     */
    void sendMiniMessage(String miniMessage);

    /**
     * kick a player from the network
     * @param message kick message
     */
    void kick(String message);

    /**
     * send the player to an instance/(Minecraft Server)
     * @param serverName name of the instance
     */
    void sendToInstance(String serverName);

    /**
     * send the player to an instance/(Minecraft Server)
     * @param instance you want to send the player to
     */
    void sendToInstance(ICloudInstance instance);
}