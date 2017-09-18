package com.bamboo.dedignmode.ObserverMode;

/**
 * Created by Administrator on 2017-09-18.
 */

public abstract class AbstractSubject {
    public abstract  void addObserver(AbstractObserver abstractObserver);

    public abstract  void deleteObserver(AbstractObserver abstractObserver);

    public abstract void updateObserver(String message);
}
