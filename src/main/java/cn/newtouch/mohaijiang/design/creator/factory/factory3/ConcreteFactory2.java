package cn.newtouch.mohaijiang.design.creator.factory.factory3;

/**
 * @author mohaijiang on 17-9-18
 */
public class ConcreteFactory2 implements Factory{

    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
