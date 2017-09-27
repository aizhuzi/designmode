package com.bamboo.dedignmode.DecoratorMode;

/**
 * Created by Administrator on 2017-09-27.
 */

public class IOSDecorator extends Decorator {
    public IOSDecorator(Component component) {
        super(component);
    }

    @Override
    public void operate(String type) {
        super.operate(type);
        changeSystem();
        installApp();
    }

    private void changeSystem(){
        System.out.println("进行越狱");
    }
    private void installApp(){
        System.out.println("自由的安装各种app");
    }
}
