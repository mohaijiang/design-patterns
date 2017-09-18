package cn.newtouch.mohaijiang.design.creator.factory.factory2;

/**
 * @author mohaijiang on 17-9-18
 */
public class Client {

    public static void main(String[] args) {
        Factory factory;
        factory = new ConcreateFactory();
        Product p = factory.factoryMethod();

        System.out.println(p.getClass());
    }

}
