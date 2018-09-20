package com.imooc.design.pattern.creational.prototype.abstractprototype;

public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("调用A的克隆");
        return super.clone();
    }
}
