package cn.newtouch.mohaijiang.design.creator.singleton.hungry;

/**
 * @author mohaijiang on 17-9-18
 */
public class Client {

    public static void main(String[] args) {
        HungrySinglenton s1 = HungrySinglenton.getInstance();
        HungrySinglenton s2 = HungrySinglenton.getInstance();

        System.out.println(s1 == s2);
    }
}
