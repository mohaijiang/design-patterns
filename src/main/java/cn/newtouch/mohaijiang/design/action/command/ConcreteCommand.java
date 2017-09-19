package cn.newtouch.mohaijiang.design.action.command;

import lombok.AllArgsConstructor;

/**
 * @author mohaijiang on 17-9-19
 */
@AllArgsConstructor
public class ConcreteCommand extends Command{

    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}
