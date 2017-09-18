package cn.newtouch.mohaijiang.design.creator.builder;

/**
 * @author mohaijiang on 17-9-18
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());

        Product p = director.construct();
        System.out.println(p.toString());
    }
}
