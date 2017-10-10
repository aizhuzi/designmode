package com.bamboo.dedignmode.IteratorMode;

/**
 * Created by Administrator on 2017-10-10.
 */

public class Groupleader extends AbstractHandler {
    @Override
    protected int limit() {
        return 2000;
    }

    @Override
    protected String getName() {
        return "组长";
    }
}
