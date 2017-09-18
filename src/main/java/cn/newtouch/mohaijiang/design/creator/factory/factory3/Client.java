package cn.newtouch.mohaijiang.design.creator.factory.factory3;

/**
 * @author mohaijiang on 17-9-18
 */
public class Client {

    public static void main(String[] args) {
        Factory factory;
        factory = new ConcreteFactory2();

        AbstractProductA a = factory.createProductA();

        AbstractProductB b = factory.createProductB();

        System.out.println(a.getClass());
        System.out.println(b.getClass());
    }
}
