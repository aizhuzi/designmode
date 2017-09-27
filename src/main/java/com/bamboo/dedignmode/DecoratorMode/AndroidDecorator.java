package com.bamboo.dedignmode.DecoratorMode;

/**
 * Created by Administrator on 2017-09-27.
 */

public class AndroidDecorator extends Decorator {
    public AndroidDecorator(Component component) {
        super(component);
    }

    @Override
    public void operate(String type) {
        super.operate(type);
        getSystemName();
        installApp();

    }

    private void getSystemName(){
        System.out.println("刷入小米系统");
    }
    private void installApp(){
        System.out.println("安装微信");
    }
}
