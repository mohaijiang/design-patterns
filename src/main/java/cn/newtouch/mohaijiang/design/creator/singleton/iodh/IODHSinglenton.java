package cn.newtouch.mohaijiang.design.creator.singleton.iodh;

/**
 * 在单例类中增加一个静态(static)内部类，在该内部类中创建单例对象，再将该单例对象通过getInstance()方法返回给外部使用
 * @author mohaijiang on 17-9-18
 */
public class IODHSinglenton {

    private IODHSinglenton(){
        // do nothing
    }

    private static class HolderClass{
        private static final IODHSinglenton instance = new IODHSinglenton();
    }

    public static IODHSinglenton getInstance(){
        return HolderClass.instance;
    }


}
