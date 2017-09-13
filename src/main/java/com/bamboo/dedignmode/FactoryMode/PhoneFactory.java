package com.bamboo.dedignmode.FactoryMode;

/**
 * Created by Administrator on 2017-09-13.
 */

public class PhoneFactory extends AbstractFactory {
    @Override
    public <T extends SimpleAbstractPhone> T creatPhone(Class<T> cas) {
        SimpleAbstractPhone phone=null;
        String name=cas.getName();
        try {
            phone=(SimpleAbstractPhone)Class.forName(name).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)phone;
    }
}
