package com.bamboo.dedignmode.IteratorMode;

/**
 * Created by Administrator on 2017-10-10.
 */

public class DirectorLeader extends AbstractHandler {
    @Override
    protected int limit() {
        return 4000;
    }

    @Override
    protected String getName() {
        return "项目经理";
    }
}
