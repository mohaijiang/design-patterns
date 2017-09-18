package cn.newtouch.mohaijiang.design.creator.singleton.hungry;

/**
 * @author mohaijiang on 17-9-18
 */
public class HungrySinglenton {

    private static final HungrySinglenton instance = new HungrySinglenton();


    private HungrySinglenton(){
        // do nothing
    }

    public static HungrySinglenton getInstance(){
        return instance;
    }
}
