package cn.newtouch.mohaijiang.design.creator.builder;

/**
 * @author mohaijiang on 17-9-18
 */
public class Director {

    private  Builder builder;

    public  Director(Builder builder) {
        this.builder=builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
