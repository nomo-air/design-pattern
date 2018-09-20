package com.imooc.design.pattern.structural.classadapter;

public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
