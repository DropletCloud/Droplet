package tech.marlonr.cloudsystem.api;

import tech.marlonr.cloudsystem.api.group.ICloudGroupProvider;
import tech.marlonr.cloudsystem.api.instance.ICloudInstanceProvider;
import tech.marlonr.cloudsystem.api.node.ICloudNodeProvider;
import tech.marlonr.cloudsystem.api.player.ICloudPlayerProvider;

/**
 * The base class of the Cloud API
 */
public abstract class CloudAPI {
    private static CloudAPI instance;


    /**
     * constructor for {@link CloudAPI}
     */
    public CloudAPI() {
        instance = this;
    }

    /**
     * @return {@link tech.marlonr.cloudsystem.api.group.ICloudGroupProvider}
     */
    public abstract ICloudGroupProvider getGroupProvider();

    /**
     * @return {@link tech.marlonr.cloudsystem.api.instance.ICloudInstanceProvider}
     */
    public abstract ICloudInstanceProvider getInstanceProvider();

    /**
     * @return {@link tech.marlonr.cloudsystem.api.instance.ICloudInstanceProvider}
     */
    public abstract ICloudPlayerProvider getCloudPlayerProvider();

    /**
     * @return {@link tech.marlonr.cloudsystem.api.node.ICloudNodeProvider}
     */
    public abstract ICloudNodeProvider getCloudNodeProvider();

    /**
     * @return the instance of {@link tech.marlonr.cloudsystem.api.CloudAPI}
     */
    public static CloudAPI getInstance() {
        return instance;
    }
}
