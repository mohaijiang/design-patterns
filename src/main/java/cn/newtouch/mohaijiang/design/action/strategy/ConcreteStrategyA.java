package cn.newtouch.mohaijiang.design.action.strategy;

/**
 * @author mohaijiang on 17-9-21
 */
public class ConcreteStrategyA implements Strategy{

    @Override
    public void algorithm() {
        // a 策略算法
        System.out.println("a 策略算法");
    }
}
