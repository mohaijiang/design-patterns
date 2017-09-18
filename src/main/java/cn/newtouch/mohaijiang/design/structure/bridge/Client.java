package cn.newtouch.mohaijiang.design.structure.bridge;

/**
 *
 * @author mohaijiang on 17-9-18
 */
public class Client {

    public static void main(String[] args) {
        Implementor impl = new ConcreteImplementorB();
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImpl(impl);

        abstraction.operation();
    }
}
