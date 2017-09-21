package cn.newtouch.mohaijiang.design.action.strategy;

/**
 * @author mohaijiang on 17-9-21
 */
public class Client {

    public static void main(String[] args) {

        Context context = new Context();
        Strategy strategy = new ConcreteStrategyA();
        context.setStrategy(strategy);

        context.algorithm();
    }
}
