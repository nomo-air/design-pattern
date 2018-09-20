package com.imooc.design.pattern.structural.adapter.objectdapter;


public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
