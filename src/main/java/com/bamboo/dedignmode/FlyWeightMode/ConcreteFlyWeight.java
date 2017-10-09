package com.bamboo.dedignmode.FlyWeightMode;


/**
 * Created by Administrator on 2017-10-09.
 */

public class ConcreteFlyWeight implements FlyWeight {
    private boolean mFlag;
    private int mCount;
    public ConcreteFlyWeight(int count){
        mCount=count;
    }
    @Override
    public void operation(boolean flag) {
        if(flag){
            System.out.println("第"+mCount+"结束");
        }else {
            System.out.println("第"+mCount+"未结束");
        }
    }
}
