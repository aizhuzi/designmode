package com.bamboo.dedignmode;

import com.bamboo.dedignmode.FactoryMode.SimpleAbstractPhone;
import com.bamboo.dedignmode.FactoryMode.SimplePhoneFactory;

/**
 * Created by Administrator on 2017-09-12.
 */

public class TestMain {

    public static void main(String []args){
        testFactory();

    }
    //工厂模式测试方法
    private static void testFactory(){
        SimpleAbstractPhone phoneOne=SimplePhoneFactory.creatPhone("Android");
        phoneOne.phoneOpenOn();
        SimpleAbstractPhone phoneTwo=SimplePhoneFactory.creatPhone("IOS");
        phoneTwo.phoneOpenOn();
        SimpleAbstractPhone phoneThree=SimplePhoneFactory.creatPhone("WindowPhone");
        phoneThree.phoneOpenOn();
    }
}
