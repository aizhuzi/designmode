package com.bamboo.dedignmode.SingleMode;

/**
 * Created by Administrator on 2017-09-09.
 */

public class LazySingleMode {

    private static LazySingleMode mInstance=null;

    private LazySingleMode(){}

    public static LazySingleMode getInstance(){
        if(mInstance==null){
            mInstance=new LazySingleMode();
        }
        return mInstance;
    }
}
