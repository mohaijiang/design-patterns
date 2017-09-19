package cn.newtouch.mohaijiang.design.structure.facade;

/**
 * @author mohaijiang on 17-9-19
 */
public class Facade {

    private SubSystemA obj1 = new SubSystemA();
    private SubSystemB obj2 = new SubSystemB();
    private SubSystemC obj3 = new SubSystemC();

    void method()
    {
        obj1.methodA();
        obj2.methodB();
        obj3.methodC();
    }

}
