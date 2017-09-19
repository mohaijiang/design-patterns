package cn.newtouch.mohaijiang.design.structure.proxy;

import lombok.AllArgsConstructor;

/**
 * @author mohaijiang on 17-9-19
 */
public class Proxy extends Subject {

    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {

        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("代理前");
    }

    public void postRequest(){
        System.out.println("代理后");
    }
}
