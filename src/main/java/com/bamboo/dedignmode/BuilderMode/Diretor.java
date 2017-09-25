package com.bamboo.dedignmode.BuilderMode;

/**
 * Created by Administrator on 2017-09-25.
 */

public class Diretor {
    private Builder mBuilder;
    public Diretor(Builder builder){
        mBuilder=builder;
    }
    public void creatBuilder(String cpu,String screen,String ram){
        mBuilder.buildCpu(cpu);
        mBuilder.buildScreen(screen);
        mBuilder.bulidRam(ram);
        mBuilder.creatPhone();
    }
}
