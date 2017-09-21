package cn.newtouch.mohaijiang.design.action.state;

/**
 * @author mohaijiang on 17-9-21
 */
public class Client {

    public static void main(String[] args) {
        Context ctx = new Context();

        State a = new ConcreteStateA();
        ctx.setState(a);

        ctx.setValue(1);

        ctx.request();
        ctx.changeState();

    }
}
