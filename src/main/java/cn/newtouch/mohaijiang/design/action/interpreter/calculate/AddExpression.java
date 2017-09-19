package cn.newtouch.mohaijiang.design.action.interpreter.calculate;

import lombok.AllArgsConstructor;

/**
 * @author mohaijiang on 17-9-19
 */
@AllArgsConstructor
public class AddExpression extends AbstractExpression {

    private AbstractExpression left;

    private AbstractExpression right;

    @Override
    public int calculate(Context context) {
        return left.calculate(context) + right.calculate(context);
    }
}
