package com.bamboo.dedignmode;

import com.bamboo.dedignmode.FactoryMode.AbstractPad;
import com.bamboo.dedignmode.FactoryMode.AbstractProductsFactory;
import com.bamboo.dedignmode.FactoryMode.AbstractWatch;
import com.bamboo.dedignmode.FactoryMode.AndroidFactory;
import com.bamboo.dedignmode.FactoryMode.IOSFactory;
import com.bamboo.dedignmode.FactoryMode.PhoneFactory;
import com.bamboo.dedignmode.FactoryMode.SimpleAbstractPhone;
import com.bamboo.dedignmode.FactoryMode.SimpleAndroid;
import com.bamboo.dedignmode.FactoryMode.SimpleIOS;
import com.bamboo.dedignmode.FactoryMode.SimplePhoneFactory;
import com.bamboo.dedignmode.FactoryMode.SimpleWindowPhone;

/**
 * Created by Administrator on 2017-09-12.
 */

public class TestMain {

    public static void main(String []args){
//        testSimpleFactory();
//        System.out.println("_____________________________");
//        testFactory();
//        System.out.println("_____________________________");
        testAbstractFactory();

    }
    //简单工厂模式测试方法
    private static void testSimpleFactory(){
        SimpleAbstractPhone phoneOne=SimplePhoneFactory.creatPhone("Android");
        phoneOne.phoneOpenOn();
        SimpleAbstractPhone phoneTwo=SimplePhoneFactory.creatPhone("IOS");
        phoneTwo.phoneOpenOn();
        SimpleAbstractPhone phoneThree=SimplePhoneFactory.creatPhone("WindowPhone");
        phoneThree.phoneOpenOn();
    }

    //工厂方法模式测试方法（单个抽象工厂）
    private static void testFactory(){
        PhoneFactory phoneFactory=new PhoneFactory();
        SimpleAbstractPhone phoneOne=phoneFactory.creatPhone(SimpleAndroid.class);
        phoneOne.phoneOpenOn();
        SimpleAbstractPhone phoneTwo=phoneFactory.creatPhone(SimpleIOS.class);
        phoneTwo.phoneOpenOn();
        SimpleAbstractPhone phoneThree=phoneFactory.creatPhone(SimpleWindowPhone.class);
        phoneThree.phoneOpenOn();

    }
    //抽象工厂方法模式测试（多个工厂）
    private static void testAbstractFactory(){
        AbstractProductsFactory androidFactory=new AndroidFactory();
        AbstractPad androidPad=androidFactory.creatPad();
        androidPad.showName();
        AbstractWatch androidWatch=androidFactory.creatWatch();
        androidWatch.getName();
        AbstractProductsFactory iosFactory=new IOSFactory();
        AbstractPad iosPad=iosFactory.creatPad();
        iosPad.showName();
        AbstractWatch iosWatch=iosFactory.creatWatch();
        iosWatch.getName();
    }
}
