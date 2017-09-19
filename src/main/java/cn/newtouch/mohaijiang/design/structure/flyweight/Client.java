package cn.newtouch.mohaijiang.design.structure.flyweight;

/**
 * @author mohaijiang on 17-9-19
 */
public class Client {

    public static void main(String[] args) {
        Flywight flywight = FlywightFactory.getInstance().getFlywight("a");
        flywight.opreation("b");
    }
}
