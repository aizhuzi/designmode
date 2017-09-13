package com.bamboo.dedignmode.FactoryMode;

/**
 * Created by Administrator on 2017-09-13.
 */

public class AndroidFactory extends AbstractProductsFactory {
    @Override
    public AbstractPad creatPad() {
        return new AndroidPad();
    }

    @Override
    public AbstractWatch creatWatch() {
        return new AndroidWatch();
    }
}
