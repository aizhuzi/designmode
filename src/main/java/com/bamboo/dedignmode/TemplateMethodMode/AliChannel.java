package com.bamboo.dedignmode.TemplateMethodMode;

/**
 * Created by Administrator on 2017-09-19.
 */

public class AliChannel extends AbstractTemplate {
    @Override
    public void realinit() {
        System.out.println("支付宝渠道初始化");
    }

    @Override
    public void realLogin() {
        System.out.println("支付宝渠道登录");
    }

    @Override
    public void realPay() {
        System.out.println("支付宝渠道支付");
    }
}
