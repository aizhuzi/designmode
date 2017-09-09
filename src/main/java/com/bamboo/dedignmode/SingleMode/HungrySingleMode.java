package com.bamboo.dedignmode.SingleMode;

/**
 * Created by Administrator on 2017-09-09.
 */

public class HungrySingleMode {

    private static HungrySingleMode mInstance=new HungrySingleMode();

    private HungrySingleMode(){}

    public static HungrySingleMode getInstance(){
        return mInstance;
    }
}
