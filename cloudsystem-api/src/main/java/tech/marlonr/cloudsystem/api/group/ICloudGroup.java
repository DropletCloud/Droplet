package tech.marlonr.cloudsystem.api.group;

/**
 * The Cloud Group that groups Cloud Instances
 */
public interface ICloudGroup {
    /**
     * @return the name of the group
     */
    String getName();

    /**
     * @return The minimum number of instances that must be online.
     */
    int getMinOnlineCount();
}
