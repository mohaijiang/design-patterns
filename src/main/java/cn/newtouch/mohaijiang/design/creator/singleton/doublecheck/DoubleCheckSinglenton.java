package cn.newtouch.mohaijiang.design.creator.singleton.doublecheck;

/**
 * 双重检查式
 * @author mohaijiang on 17-9-18
 */
public class DoubleCheckSinglenton {

    private volatile static DoubleCheckSinglenton instance = null;

    private DoubleCheckSinglenton(){
        // do nothing

    }

    public static DoubleCheckSinglenton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSinglenton.class){
                if(instance == null){
                    instance = new DoubleCheckSinglenton();
                }
            }
        }
        return instance;
    }

}
