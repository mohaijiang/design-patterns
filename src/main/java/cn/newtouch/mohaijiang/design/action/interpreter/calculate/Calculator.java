package cn.newtouch.mohaijiang.design.action.interpreter.calculate;

import java.util.Stack;

/**
 * @author mohaijiang on 17-9-19
 */
public class Calculator {

    public int calc(String command){
        Stack<AbstractExpression> stack = new Stack<>();
        Context context = new Context();
        String[] words = command.split("\\s+");

        for(int i = 0 ;i < words.length;i++){
            if("+".equalsIgnoreCase(words[i])){
                AbstractExpression left = stack.pop();
                AbstractExpression right = new ValueExpression(Integer.valueOf(words[++i]));
                AbstractExpression add = new AddExpression(left,right);
                stack.push(add);
            }else if("-".equalsIgnoreCase(words[i])){
                AbstractExpression left = stack.pop();
                AbstractExpression right = new ValueExpression(Integer.valueOf(words[++i]));
                AbstractExpression add = new SubtractExpression(left,right);
                stack.push(add);
            }else {
                ValueExpression value = new ValueExpression(Integer.valueOf(words[i]));
                stack.push(value);
            }
        }

        return stack.pop().calculate(context);
    }
}
