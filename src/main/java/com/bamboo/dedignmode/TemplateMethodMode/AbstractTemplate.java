package com.bamboo.dedignmode.TemplateMethodMode;

/**
 * Created by Administrator on 2017-09-19.
 */

public abstract class AbstractTemplate {

    public final void working(){
        init();
        beginLogin();
        beginPay();
        endDoSomething();
    }

    protected void init(){
        System.out.println("本地初始化开始");
        realinit();
    }
    public abstract void realinit();

    protected void beginLogin(){
        System.out.println("本地登录开始");
        realLogin();
    }
    public abstract void realLogin();
    protected void beginPay(){
        System.out.println("本地支付开始");
        realPay();
    }
    public abstract void realPay();

    protected void endDoSomething(){
        System.out.println("流程结束");
        System.out.println("__________________________________");
    }
}
