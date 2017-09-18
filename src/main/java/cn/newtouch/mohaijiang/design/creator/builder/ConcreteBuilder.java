package cn.newtouch.mohaijiang.design.creator.builder;

/**
 * @author mohaijiang on 17-9-18
 */
public class ConcreteBuilder extends Builder{


    public void buildPartA() {
        super.product.setPartA("this is a");
    }

    public void buildPartB() {
        super.product.setPartB("this is b");

    }

    public void buildPartC() {
        super.product.setPartC("this is c");
    }
}
