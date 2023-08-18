package tech.marlonr.cloudsystem.api;

import lombok.Getter;
import tech.marlonr.cloudsystem.api.group.ICloudGroupProvider;
import tech.marlonr.cloudsystem.api.instance.ICloudInstanceProvider;
import tech.marlonr.cloudsystem.api.player.ICloudPlayerProvider;

public abstract class CloudAPI {
    @Getter private static CloudAPI instance;

    public CloudAPI() {
        instance = this;
    }

    public abstract ICloudGroupProvider getGroupProvider();
    public abstract ICloudInstanceProvider getInstanceProvider();
    public abstract ICloudPlayerProvider getCloudPlayerProvider();
}
