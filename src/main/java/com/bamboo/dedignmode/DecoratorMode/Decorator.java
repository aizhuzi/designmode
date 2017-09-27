package com.bamboo.dedignmode.DecoratorMode;

/**
 * Created by Administrator on 2017-09-27.
 */

public abstract class Decorator extends Component {
    private Component mComponent;

    public Decorator(Component component){
        mComponent=component;
    }

    @Override
    public void operate(String type) {
        mComponent.operate(type);
    }
}
