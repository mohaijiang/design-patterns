package cn.newtouch.mohaijiang.design.action.observer.jdkobs;

import java.util.Observable;

/**
 * 队伍
 * @author mohaijiang on 17-9-20
 */
public class Team extends Observable{

    public void beAcctack(){
        System.out.println("被攻击了");
        setChanged();
        notifyObservers();
    }

}
