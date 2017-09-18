package cn.newtouch.mohaijiang.design.creator.factory.factory3;

/**
 * @author mohaijiang on 17-9-18
 */
public class ConcreteFactory1 implements Factory{

    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
