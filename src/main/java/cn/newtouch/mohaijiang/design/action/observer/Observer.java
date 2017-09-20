package cn.newtouch.mohaijiang.design.action.observer;

/**
 * @author mohaijiang on 17-9-20
 */
public interface Observer {

    void update(Subject subject);

    default void doOtherThing(){
        System.out.println("do other thines");
    }

}
