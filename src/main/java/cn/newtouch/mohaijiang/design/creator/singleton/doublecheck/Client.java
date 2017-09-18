package cn.newtouch.mohaijiang.design.creator.singleton.doublecheck;

import cn.newtouch.mohaijiang.design.creator.singleton.hungry.HungrySinglenton;

/**
 * @author mohaijiang on 17-9-18
 */
public class Client {

    public static void main(String[] args) {
        DoubleCheckSinglenton s1 = DoubleCheckSinglenton.getInstance();
        DoubleCheckSinglenton s2 = DoubleCheckSinglenton.getInstance();

        System.out.println(s1 == s2);
    }
}
