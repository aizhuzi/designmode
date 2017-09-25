package com.bamboo.dedignmode.BuilderMode;

/**
 * Created by Administrator on 2017-09-25.
 */

public class Phone {
    private String mCpu;
    private String mRam;
    private String mScreen;

    public void setCpu(String cpu) {
        mCpu = cpu;
        System.out.println("使用"+cpu+"处理器");
    }

    public void setRam(String ram) {
        mRam = ram;
        System.out.println("拥有"+ram+"内存");
    }

    public void setScreen(String screen) {
        mScreen = screen;
        System.out.println("使用"+screen+"屏幕");
    }
}
