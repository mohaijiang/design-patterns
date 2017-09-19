package cn.newtouch.mohaijiang.design.structure.flyweight;

import lombok.AllArgsConstructor;

/**
 * @author mohaijiang on 17-9-19
 */
@AllArgsConstructor
public class ConcreteFlywight implements Flywight{

    private String key;

    @Override
    public void opreation(String extrinsicState) {
        System.out.println("k :" +key+"\textrinsicState:"+extrinsicState);
    }
}
