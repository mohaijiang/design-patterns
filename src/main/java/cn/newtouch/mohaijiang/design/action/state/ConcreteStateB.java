package cn.newtouch.mohaijiang.design.action.state;

/**
 * @author mohaijiang on 17-9-21
 */
public class ConcreteStateB extends State{

    @Override
    public void handler() {
        System.out.println("状态B的业务逻辑");
    }
}
