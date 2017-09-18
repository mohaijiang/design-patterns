package cn.newtouch.mohaijiang.design.structure.bridge;

/**
 * @author mohaijiang on 17-9-18
 */
public class RefinedAbstraction extends Abstraction{

    @Override
    public void operation() {
        System.out.println("处理事情1");
        super.impl.operationImpl();
        System.out.println("处理事情2");
    }
}
