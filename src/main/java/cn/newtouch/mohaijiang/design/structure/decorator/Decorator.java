package cn.newtouch.mohaijiang.design.structure.decorator;

import lombok.AllArgsConstructor;

/**
 * @author mohaijiang on 17-9-19
 */
@AllArgsConstructor
public class Decorator implements Component{


    private Component component;


    @Override
    public void operation() {
        component.operation();
    }
}
