package com.bamboo.dedignmode.TemplateMethodMode;

/**
 * Created by Administrator on 2017-09-19.
 */

public class TemplateCommon {
    private static TemplateCommon mInstance;

    private TemplateCommon(){}

    public static TemplateCommon getInstance(){
        if(mInstance==null){
            synchronized (TemplateCommon.class){
                if (mInstance==null){
                    mInstance=new TemplateCommon();
                }
            }
        }
        return mInstance;
    }

    public void begin(AbstractTemplate template){
        template.working();
    }
}
