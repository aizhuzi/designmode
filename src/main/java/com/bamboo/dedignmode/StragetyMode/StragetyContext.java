package com.bamboo.dedignmode.StragetyMode;

/**
 * Created by Administrator on 2017-09-26.
 */

public class StragetyContext {
    private AbstractStragety mAbstractStragety;

    public StragetyContext(AbstractStragety abstractStragety) {
        mAbstractStragety = abstractStragety;
    }

    public void buyPhone(){
        mAbstractStragety.buyPhone();
    }
}
