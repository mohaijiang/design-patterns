package cn.newtouch.mohaijiang.design.structure.adaptor;

import lombok.AllArgsConstructor;

/**
 * @author mohaijiang on 17-9-18
 */
@AllArgsConstructor
public class Adaptor implements Target{

    private Adaptee adaptee;


    public void request() {
        this.adaptee.secificRequest();
    }
}
