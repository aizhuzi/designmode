package com.bamboo.dedignmode.FacadeMode;

/**
 * Created by Administrator on 2017-09-28.
 */

public class Facade {
    private InitFuction mInitFuction;
    private LoginFuction mLoginFuction;
    private PayFuction mPayFuction;

    public Facade(LoginFuction loginFuction, InitFuction initFuction, PayFuction payFuction) {
        mLoginFuction = loginFuction;
        mInitFuction = initFuction;
        mPayFuction = payFuction;
    }
    public void init(){
        mInitFuction.init();
    }

    public void login(){
        mInitFuction.initSuccess();
        mLoginFuction.login();
    }

    public void pay(){
        mLoginFuction.loginSuccess();
        mPayFuction.pay();
        mPayFuction.paySuccess();
    }
}
