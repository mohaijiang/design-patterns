package cn.newtouch.mohaijiang.design.structure.proxy;

/**
 * @author mohaijiang on 17-9-19
 */
public class RealSubject extends Subject{

    @Override
    public void request() {
        System.out.println("实际调用请求");
    }
}
