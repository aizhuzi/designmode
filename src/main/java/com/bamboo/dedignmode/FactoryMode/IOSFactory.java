package com.bamboo.dedignmode.FactoryMode;

/**
 * Created by Administrator on 2017-09-13.
 */

public class IOSFactory extends AbstractProductsFactory {
    @Override
    public AbstractPad creatPad() {
        return new IOSPad();
    }

    @Override
    public AbstractWatch creatWatch() {
        return new IOSWatch();
    }
}
