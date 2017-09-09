package com.bamboo.dedignmode.SingleMode;

/**
 * Created by Administrator on 2017-09-09.
 */

public class LazySingleSafeMode {
    private static LazySingleSafeMode mInstance;

    private LazySingleSafeMode(){}

    public static synchronized LazySingleSafeMode getInstance(){
        if(mInstance==null){
            mInstance=new LazySingleSafeMode();
        }
        return mInstance;
    }
}
