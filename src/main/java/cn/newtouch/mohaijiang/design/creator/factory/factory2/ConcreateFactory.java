package cn.newtouch.mohaijiang.design.creator.factory.factory2;

/**
 * @author mohaijiang on 17-9-18
 */
public class ConcreateFactory extends Factory {

    public Product factoryMethod() {
        return new ConcreateProduct();
    }
}
