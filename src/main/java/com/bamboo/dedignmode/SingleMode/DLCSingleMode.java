package com.bamboo.dedignmode.SingleMode;

/**
 * Created by Administrator on 2017-09-09.
 */

public class DLCSingleMode {
    private volatile static DLCSingleMode mInstance;

    private DLCSingleMode(){}

    public static DLCSingleMode getInstance(){
        if (mInstance==null){
            synchronized (DLCSingleMode.class){
                if(mInstance==null){
                    mInstance=new DLCSingleMode();
                }
            }
        }
        return mInstance;
    }
}
