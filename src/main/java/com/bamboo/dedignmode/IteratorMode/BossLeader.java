package com.bamboo.dedignmode.IteratorMode;

/**
 * Created by Administrator on 2017-10-10.
 */

public class BossLeader extends AbstractHandler {
    @Override
    protected int limit() {
        return 6000;
    }

    @Override
    protected String getName() {
        return "老板";
    }
}
