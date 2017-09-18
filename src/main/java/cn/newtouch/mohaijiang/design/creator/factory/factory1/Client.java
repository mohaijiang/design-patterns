package cn.newtouch.mohaijiang.design.creator.factory.factory1;

/**
 * client客户端
 */
public class Client {

    public static void main(String[] args) {
        Product p = Factory.getProduct("a");

        System.out.println(p.getClass());
    }


}
