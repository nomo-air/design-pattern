package com.imooc.design.pattern.structural.adapter.objectdapter;


public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Adapter adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
