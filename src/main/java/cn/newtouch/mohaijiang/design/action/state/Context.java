package cn.newtouch.mohaijiang.design.action.state;

/**
 * @author mohaijiang on 17-9-21
 */
public class Context {

    private State state;

    private int value;


    public void setState(State state){
        this.state = state;
    }


    public void request(){

        //其他代码
         state.handler(); //调用状态对象业务方法
        //其他代码
    }

    /**
     * 变更状态有2种方式，1是在context写逻辑，2是在state内写逻辑，这里采用第一种
     */
    public void changeState(){
        if(value == 0){
            this.setState(new ConcreteStateA());
        }else if(value == 1){
            this.setState(new ConcreteStateB());
        }else {
            // other ...
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
