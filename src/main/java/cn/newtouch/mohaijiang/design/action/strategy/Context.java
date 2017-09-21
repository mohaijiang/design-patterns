package cn.newtouch.mohaijiang.design.action.strategy;

/**
 * @author mohaijiang on 17-9-21
 */
public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void algorithm(){
        this.strategy.algorithm();
    }
}
