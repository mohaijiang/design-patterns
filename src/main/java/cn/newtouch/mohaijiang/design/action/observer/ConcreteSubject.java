package cn.newtouch.mohaijiang.design.action.observer;

/**
 * @author mohaijiang on 17-9-20
 */
public class ConcreteSubject extends Subject{

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    @Override
    public void notifyi(String observerState) {
        for(Observer obs : observers){
            obs.doOtherThing();
        }
    }
}
