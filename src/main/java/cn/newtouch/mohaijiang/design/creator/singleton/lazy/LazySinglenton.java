package cn.newtouch.mohaijiang.design.creator.singleton.lazy;

/**
 * @author mohaijiang on 17-9-18
 */
public class LazySinglenton {

    private static LazySinglenton instance = null;

    private LazySinglenton(){

    }

    public synchronized static LazySinglenton getInstance(){
        if(instance == null){
            instance = new LazySinglenton();
        }

        return instance;
    }

}
