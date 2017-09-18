package cn.newtouch.mohaijiang.design.structure.bridge;

/**
 * @author mohaijiang on 17-9-18
 */
public abstract class Abstraction {

    protected Implementor impl;

    public void setImpl(Implementor impl) {
        this.impl=impl;
    }

    public abstract void operation();

}


