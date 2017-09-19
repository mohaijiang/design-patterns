package cn.newtouch.mohaijiang.design.action.interpreter.calculate;

import java.util.Stack;

/**
 * @author mohaijiang on 17-9-19
 */
public class Client {

    public static void main(String[] args) {

        String command = "1 + 2 + 3 + 8 - 11 - 2 ";

        Calculator calculator = new Calculator();
        System.out.println(calculator.calc(command));
    }
}
