package cn.newtouch.mohaijiang.design.structure.flyweight;

import lombok.AllArgsConstructor;

/**
 * @author mohaijiang on 17-9-19
 */
@AllArgsConstructor
public class ConcreteFlyweight implements Flyweight {

    private String key;

    @Override
    public void operation(String extrinsicState) {
        System.out.println("k :" +key+"\textrinsicState:"+extrinsicState);
    }
}
