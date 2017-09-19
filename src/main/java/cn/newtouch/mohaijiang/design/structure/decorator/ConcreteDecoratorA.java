package cn.newtouch.mohaijiang.design.structure.decorator;

/**
 * @author mohaijiang on 17-9-19
 */
public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();

        this.addedBehavior();
    }


    public void addedBehavior(){
        System.out.println("执行具体业务方法");
    }
}
