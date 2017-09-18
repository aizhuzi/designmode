package com.bamboo.dedignmode.ObserverMode;

/**
 * Created by Administrator on 2017-09-18.
 */

public class WPObserver extends AbstractObserver {
    @Override
    public void update(String message) {
        System.out.println("WP系统收到信息"+message);
    }
}
