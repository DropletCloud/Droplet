package tech.marlonr.cloudsystem.api;

import lombok.Getter;
import tech.marlonr.cloudsystem.api.group.ICloudGroupProvider;
import tech.marlonr.cloudsystem.api.instance.ICloudInstanceProvider;
import tech.marlonr.cloudsystem.api.node.ICloudNodeProvider;
import tech.marlonr.cloudsystem.api.player.ICloudPlayerProvider;

public abstract class CloudAPI {
    private static CloudAPI instance;

    public CloudAPI() {
        instance = this;
    }

    public abstract ICloudGroupProvider getGroupProvider();
    public abstract ICloudInstanceProvider getInstanceProvider();
    public abstract ICloudPlayerProvider getCloudPlayerProvider();
    public abstract ICloudNodeProvider getCloudNodeProvider();

    public static CloudAPI getInstance() {
        return instance;
    }
}
