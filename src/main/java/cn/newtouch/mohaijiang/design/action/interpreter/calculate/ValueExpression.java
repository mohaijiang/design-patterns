package cn.newtouch.mohaijiang.design.action.interpreter.calculate;

import lombok.AllArgsConstructor;

/**
 * @author mohaijiang on 17-9-19
 */
@AllArgsConstructor
public class ValueExpression extends AbstractExpression {

    private int value;

    @Override
    public int calculate(Context context) {
        context.setResult(value);
        return context.getResult();
    }
}
