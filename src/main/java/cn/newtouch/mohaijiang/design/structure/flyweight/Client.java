package cn.newtouch.mohaijiang.design.structure.flyweight;

/**
 * @author mohaijiang on 17-9-19
 */
public class Client {

    public static void main(String[] args) {
        Flyweight flyweight = FlyweightFactory.getInstance().getFlywight("a");
        flyweight.operation("b");
    }
}
