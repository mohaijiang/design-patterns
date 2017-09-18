package cn.newtouch.mohaijiang.design.creator.factory.factory1;

/**
 * 工厂类
 */
public class Factory {

    /**
     * 根据类型获取产品
     * @param arg 产品类型
     * @return
     */
    public static Product getProduct(String arg){
        if("A".equalsIgnoreCase(arg)){
            return new ConcreteProductA();
        }else {
            return new ConcreteProductB();
        }
    }

}

