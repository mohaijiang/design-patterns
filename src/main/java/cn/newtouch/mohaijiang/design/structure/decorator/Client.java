package cn.newtouch.mohaijiang.design.structure.decorator;

/**
 * @author mohaijiang on 17-9-19
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decorator = new ConcreteDecoratorA(component);

        decorator.operation();
    }
}
