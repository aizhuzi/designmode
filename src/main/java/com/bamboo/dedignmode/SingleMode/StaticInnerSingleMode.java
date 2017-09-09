package com.bamboo.dedignmode.SingleMode;

/**
 * Created by Administrator on 2017-09-09.
 */

public class StaticInnerSingleMode {

    private StaticInnerSingleMode(){}

    public static StaticInnerSingleMode getInstance(){
        return SingletonHolder.instance;
    }

    private static class SingletonHolder{
        private static final StaticInnerSingleMode instance=new StaticInnerSingleMode();
    }
}
