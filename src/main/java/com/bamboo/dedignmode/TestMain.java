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
import com.bamboo.dedignmode.ObserverMode.AndroidObserver;
import com.bamboo.dedignmode.ObserverMode.ConcreteSubject;
import com.bamboo.dedignmode.ObserverMode.IOSObserver;
import com.bamboo.dedignmode.ObserverMode.WPObserver;
import com.bamboo.dedignmode.TemplateMethodMode.AliChannel;
import com.bamboo.dedignmode.TemplateMethodMode.BaiduChannel;
import com.bamboo.dedignmode.TemplateMethodMode.TemplateCommon;
import com.bamboo.dedignmode.TemplateMethodMode.WechatChannel;

/**
 * Created by Administrator on 2017-09-12.
 */

public class TestMain {

    public static void main(String []args){
//        testSimpleFactory();
//        System.out.println("_____________________________");
//        testFactory();
//        System.out.println("_____________________________");
//        testAbstractFactory();
        //testObserver();
        testTemplateMethod();

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
    //观察者模式测试方法
    private static void testObserver(){
        ConcreteSubject subject=new ConcreteSubject();
        AndroidObserver androidObserver=new AndroidObserver();
        IOSObserver iosObserver=new IOSObserver();
        WPObserver wpObserver=new WPObserver();
        subject.addObserver(androidObserver);
        subject.addObserver(iosObserver);
        subject.addObserver(wpObserver);
        subject.updateObserver("赶快更新");
    }
    //模板方法模式测试方法
    public static void testTemplateMethod(){
        AliChannel aliChannel=new AliChannel();
        WechatChannel wechatChannel=new WechatChannel();
        BaiduChannel baiduChannel=new BaiduChannel();
        TemplateCommon.getInstance().begin(aliChannel);
        TemplateCommon.getInstance().begin(wechatChannel);
        TemplateCommon.getInstance().begin(baiduChannel);
    }

}
