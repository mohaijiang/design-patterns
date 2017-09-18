package cn.newtouch.mohaijiang.design.structure.adaptor;

/**
 * @author mohaijiang on 17-9-18
 */
public class Client {

    public static void main(String[] args) {
        Target target = new Adaptor(new Adaptee());

        target.request();
    }
}
