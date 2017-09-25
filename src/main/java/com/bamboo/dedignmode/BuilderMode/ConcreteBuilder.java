package com.bamboo.dedignmode.BuilderMode;

/**
 * Created by Administrator on 2017-09-25.
 */

public class ConcreteBuilder extends Builder {
    private Phone mPhone;

    public ConcreteBuilder(){
        mPhone=new Phone();
    }
    @Override
    public void buildCpu(String cpuName) {
        mPhone.setCpu(cpuName);
    }

    @Override
    public void buildScreen(String screenName) {
        mPhone.setScreen(screenName);
    }

    @Override
    public void bulidRam(String ramName) {
        mPhone.setRam(ramName);
    }

    @Override
    public Phone creatPhone() {
        return mPhone;
    }
}
