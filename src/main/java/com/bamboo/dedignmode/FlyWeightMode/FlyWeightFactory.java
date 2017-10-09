package com.bamboo.dedignmode.FlyWeightMode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-10-09.
 */

public class FlyWeightFactory {
    private static Map<Integer,FlyWeight> mPool=new HashMap<>();


    public static FlyWeight getStatus(int i){
        if(mPool.containsKey(i)){
            System.out.println("获取到存在的第"+i+"对象");
            return mPool.get(i);
        }else{
            FlyWeight flyWeight=new ConcreteFlyWeight(i);
            mPool.put(i,flyWeight);
            System.out.println("创建新的第"+i+"对象");
            return flyWeight;

        }
    }

}
