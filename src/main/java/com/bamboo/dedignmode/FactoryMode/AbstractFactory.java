package com.bamboo.dedignmode.FactoryMode;

/**
 * Created by Administrator on 2017-09-13.
 */

public abstract class AbstractFactory {

    public abstract <T extends SimpleAbstractPhone>T creatPhone(Class<T> cas);
}
