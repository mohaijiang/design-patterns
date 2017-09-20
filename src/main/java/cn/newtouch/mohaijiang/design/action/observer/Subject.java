package cn.newtouch.mohaijiang.design.action.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author mohaijiang on 17-9-20
 */
public abstract class Subject {

    protected List<Observer> observers = Lists.newLinkedList();

    public void attach(Observer obs){
        observers.add(obs);
    }

    public void detach(Observer obs){
        observers.remove(obs);
    }

    public abstract void notifyi(String observerState);
}
