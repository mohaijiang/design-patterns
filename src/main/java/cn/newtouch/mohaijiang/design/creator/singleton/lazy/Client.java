package cn.newtouch.mohaijiang.design.creator.singleton.lazy;

/**
 * 懒汉式单例
 * @author mohaijiang on 17-9-18
 */
public class Client {

    public static void main(String[] args) {
        LazySinglenton s1 = LazySinglenton.getInstance();
        LazySinglenton s2 = LazySinglenton.getInstance();

        System.out.println(s1 == s2);

    }

}
