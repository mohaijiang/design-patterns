package cn.newtouch.mohaijiang.design.action.observer.jdkobs;

import lombok.AllArgsConstructor;

import java.util.Observable;
import java.util.Observer;

/**
 * @author mohaijiang on 17-9-20
 */
@AllArgsConstructor
public class Player implements Observer{

    private String name;

    @Override
    public void update(Observable observable, Object o) {

        System.out.println("坚持住，"+name+"正在过来救你!");

    }

    public void help(){

    }
}
