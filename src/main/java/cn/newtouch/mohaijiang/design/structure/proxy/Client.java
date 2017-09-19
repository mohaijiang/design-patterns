package cn.newtouch.mohaijiang.design.structure.proxy;

/**
 * @author mohaijiang on 17-9-19
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}
