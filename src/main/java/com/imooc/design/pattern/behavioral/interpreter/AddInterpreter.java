package com.imooc.design.pattern.behavioral.interpreter;

public class AddInterpreter implements Interpreter {

    private Interpreter firseExpression, secondExpression;

    public AddInterpreter(Interpreter firseExpression, Interpreter secondExpression) {
        this.firseExpression = firseExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firseExpression.interpret() + this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
