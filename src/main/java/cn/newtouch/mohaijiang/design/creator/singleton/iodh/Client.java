package cn.newtouch.mohaijiang.design.creator.singleton.iodh;

/**
 * @author mohaijiang on 17-9-18
 */
public class Client {

    public static void main(String[] args) {
        IODHSinglenton s1 = IODHSinglenton.getInstance();
        IODHSinglenton s2 = IODHSinglenton.getInstance();

        System.out.println(s1 == s2);

    }
}
