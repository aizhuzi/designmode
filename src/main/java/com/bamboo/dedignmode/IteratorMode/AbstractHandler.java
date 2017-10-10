package com.bamboo.dedignmode.IteratorMode;

/**
 * Created by Administrator on 2017-10-10.
 */

public abstract class AbstractHandler {

    public AbstractHandler nextHandler;

    public final void handleMoney(AbstractRequest request){
        if(request.getPrice()<=limit()){
            request.getResult(getName());
        }else{
            if(nextHandler !=null){
                System.out.println(getName()+"审批"+request.getName()+"不通过");
                nextHandler.handleMoney(request);
            }else{
                System.out.println("处理链断裂");
            }
        }
    }

    protected abstract int limit();

    protected abstract String getName();
}
