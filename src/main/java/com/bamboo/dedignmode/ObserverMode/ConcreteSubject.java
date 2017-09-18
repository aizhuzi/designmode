package com.bamboo.dedignmode.ObserverMode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-09-18.
 */

public class ConcreteSubject extends AbstractSubject {
    private List<AbstractObserver> list;
    public ConcreteSubject(){
        list=new ArrayList<>();
    }
    @Override
    public void addObserver(AbstractObserver abstractObserver) {
        list.add(abstractObserver);
    }

    @Override
    public void deleteObserver(AbstractObserver abstractObserver) {
        list.remove(abstractObserver);
    }

    @Override
    public void updateObserver(String message) {
        for (int i = 0; i <list.size() ; i++) {
            list.get(i).update(message);
        }
    }
}
