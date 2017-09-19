package cn.newtouch.mohaijiang.design.action.interpreter.calculate;

/**
 * 抽象计算
 * @author mohaijiang on 17-9-19
 */
public abstract class AbstractExpression {


    /**
     * 计算
     * @param context
     */
    public abstract int calculate(Context context);
}
