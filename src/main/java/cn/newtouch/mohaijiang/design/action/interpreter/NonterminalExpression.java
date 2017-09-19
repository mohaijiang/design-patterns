package cn.newtouch.mohaijiang.design.action.interpreter;

import lombok.AllArgsConstructor;

/**
 * @author mohaijiang on 17-9-19
 */
@AllArgsConstructor
public class NonterminalExpression extends AbstractExpression{

    private AbstractExpression left;

    private AbstractExpression right;

    @Override
    public void interpet(Context context) {

        //递归调用每一个组成部分的interpret()方法
        //在递归调用时指定组成部分的连接方式，即非终结符的功能

        left.interpet(context);
        right.interpet(context);
    }
}
