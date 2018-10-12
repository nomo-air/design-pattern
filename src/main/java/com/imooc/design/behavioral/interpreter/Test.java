package com.imooc.design.behavioral.interpreter;

public class Test {
    public static void main(String[] args) {
        String inputString = "6 100 11 + *";
        StackExpressionParser expressionParser = new StackExpressionParser();
        int result = expressionParser.parse(inputString);
        System.out.println("解释器计算结果：" + result);
    }
}
