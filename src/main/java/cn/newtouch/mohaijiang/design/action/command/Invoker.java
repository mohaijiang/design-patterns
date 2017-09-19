package cn.newtouch.mohaijiang.design.action.command;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @author mohaijiang on 17-9-19
 */
@AllArgsConstructor
@Setter
public class Invoker {

    private Command command;


    public void call(){
        command.execute();
    }

}
