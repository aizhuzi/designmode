package com.bamboo.dedignmode;

import com.bamboo.dedignmode.BuilderMode.ConcreteBuilder;
import com.bamboo.dedignmode.BuilderMode.Diretor;
import com.bamboo.dedignmode.DecoratorMode.AndroidDecorator;
import com.bamboo.dedignmode.DecoratorMode.ConcreteComponent;
import com.bamboo.dedignmode.DecoratorMode.IOSDecorator;
import com.bamboo.dedignmode.FacadeMode.Facade;
import com.bamboo.dedignmode.FacadeMode.InitFuction;
import com.bamboo.dedignmode.FacadeMode.LoginFuction;
import com.bamboo.dedignmode.FacadeMode.PayFuction;
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
import com.bamboo.dedignmode.FlyWeightMode.ConcreteFlyWeight;
import com.bamboo.dedignmode.FlyWeightMode.FlyWeight;
import com.bamboo.dedignmode.FlyWeightMode.FlyWeightFactory;
import com.bamboo.dedignmode.IteratorMode.AndroidPhoneRequest;
import com.bamboo.dedignmode.IteratorMode.BossLeader;
import com.bamboo.dedignmode.IteratorMode.DirectorLeader;
import com.bamboo.dedignmode.IteratorMode.Groupleader;
import com.bamboo.dedignmode.IteratorMode.IOSPhoneRequest;
import com.bamboo.dedignmode.IteratorMode.WPPhoneRequest;
import com.bamboo.dedignmode.ObserverMode.AndroidObserver;
import com.bamboo.dedignmode.ObserverMode.ConcreteSubject;
import com.bamboo.dedignmode.ObserverMode.IOSObserver;
import com.bamboo.dedignmode.ObserverMode.WPObserver;
import com.bamboo.dedignmode.StragetyMode.AndroidStragety;
import com.bamboo.dedignmode.StragetyMode.IOSStragety;
import com.bamboo.dedignmode.StragetyMode.StragetyContext;
import com.bamboo.dedignmode.StragetyMode.WPStragety;
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
        //testTemplateMethod();
       // testBuilder();
        //testStragety();
        //testDecorator();
        //testFacade();
        //testFlyWeight();
        testIterator();
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

    //建造者模式测试方法
    private  static void testBuilder(){
        ConcreteBuilder concreteBuilder=new ConcreteBuilder();
        Diretor diretor=new Diretor(concreteBuilder);
        diretor.creatBuilder("联发科","大猩猩玻璃","8G");
    }
    //策略模式测试方法
    private static void testStragety(){
        AndroidStragety androidStragety=new AndroidStragety();
        StragetyContext stragetyContextOne=new StragetyContext(androidStragety);
        stragetyContextOne.buyPhone();
        IOSStragety iosStragety=new IOSStragety();
        StragetyContext stragetyContextTwo=new StragetyContext(iosStragety);
        stragetyContextTwo.buyPhone();
        WPStragety wpStragety=new WPStragety();
        StragetyContext stragetyContextThree=new StragetyContext(wpStragety);
        stragetyContextThree.buyPhone();
    }
    //装饰着模式测试方法
    private static void testDecorator(){
        ConcreteComponent concreteComponent=new ConcreteComponent();
        AndroidDecorator androidDecorator=new AndroidDecorator(concreteComponent);
        androidDecorator.operate("安卓");
        System.out.println("__________________________________________");
        IOSDecorator iosDecorator=new IOSDecorator(concreteComponent);
        iosDecorator.operate("IOS");
    }

    //外观模式测试方法
    private static void testFacade(){
        InitFuction initFuction=new InitFuction();
        LoginFuction loginFuction=new LoginFuction();
        PayFuction payFuction=new PayFuction();
        Facade facade=new Facade(loginFuction,initFuction,payFuction);
        facade.init();
        facade.login();
        facade.pay();
    }
    //享元模式测试方法
    private static void testFlyWeight(){
        FlyWeight flyWeightOne=new ConcreteFlyWeight(1);
        FlyWeightFactory.getStatus(1);
        flyWeightOne.operation(true);
        FlyWeight flyWeightTwo=new ConcreteFlyWeight(1);
        FlyWeightFactory.getStatus(1);
        flyWeightTwo.operation(false);
        FlyWeight flyWeightThree=new ConcreteFlyWeight(2);
        FlyWeightFactory.getStatus(2);
        flyWeightThree.operation(true);
    }
    //责任链模式测试方法
    private static void testIterator(){
        WPPhoneRequest wpPhoneRequest=new WPPhoneRequest();
        AndroidPhoneRequest androidPhoneRequest=new AndroidPhoneRequest();
        IOSPhoneRequest iosPhoneRequest=new IOSPhoneRequest();
        Groupleader groupleader=new Groupleader();
        DirectorLeader directorLeader=new DirectorLeader();
        BossLeader bossLeader=new BossLeader();
        directorLeader.nextHandler=bossLeader;
        groupleader.nextHandler=directorLeader;
        groupleader.handleMoney(wpPhoneRequest);
        groupleader.handleMoney(androidPhoneRequest);
        groupleader.handleMoney(iosPhoneRequest);
    }
}
