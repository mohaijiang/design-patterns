package cn.newtouch.mohaijiang.design.action.observer;

/**
 * @author mohaijiang on 17-9-20
 */
public class ConcreteObserver implements Observer{

    private String observerState;

    @Override
    public void update(Subject subject) {
       subject.notifyi(observerState);
    }
}
