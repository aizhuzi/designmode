package com.bamboo.dedignmode.DecoratorMode;

/**
 * Created by Administrator on 2017-09-27.
 */

public class ConcreteComponent extends Component {
    @Override
    public void operate(String type) {
        System.out.println("使用"+type+"手机");
    }
}
