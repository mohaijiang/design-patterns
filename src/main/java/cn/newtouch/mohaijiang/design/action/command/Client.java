package cn.newtouch.mohaijiang.design.action.command;

/**
 * @author mohaijiang on 17-9-19
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ConcreteCommand(new Receiver()));

        invoker.call();
    }
}
