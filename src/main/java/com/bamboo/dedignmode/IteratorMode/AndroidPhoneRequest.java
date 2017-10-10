package com.bamboo.dedignmode.IteratorMode;

/**
 * Created by Administrator on 2017-10-10.
 */

public class AndroidPhoneRequest extends AbstractRequest {
    @Override
    public int getPrice() {
        return 4000;
    }

    @Override
    public void getResult(String name) {
        System.out.println(getName()+"被"+name+"审批通过");
    }

    @Override
    public String getName() {
        return "android手机";
    }
}
