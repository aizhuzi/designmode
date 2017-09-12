package com.bamboo.dedignmode.FactoryMode;

/**
 * Created by Administrator on 2017-09-12.
 */

public  class SimplePhoneFactory {

    public static SimpleAbstractPhone creatPhone(String name){
        SimpleAbstractPhone phone=null;
        if(name.equals("Android")){
            phone=new SimpleAndroid();
        }else if(name.equals("IOS")){
            phone=new SimpleIOS();
        }else if(name.equals("WindowPhone")){
            phone=new SimpleWindowPhone();
        }
        return phone;
    }
}
