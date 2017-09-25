package com.bamboo.dedignmode.BuilderMode;

/**
 * Created by Administrator on 2017-09-25.
 */

public abstract class Builder {
    public abstract void buildCpu(String cpuName);
    public abstract void buildScreen(String screenName);
    public abstract void bulidRam(String ramName);
    public abstract Phone creatPhone();
}
