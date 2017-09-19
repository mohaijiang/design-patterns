package cn.newtouch.mohaijiang.design.structure.decorator;

/**
 * @author mohaijiang on 17-9-19
 */
public class ConcreteComponent implements Component{

    @Override
    public void operation() {
        System.out.println("实现具体功能");
    }
}
