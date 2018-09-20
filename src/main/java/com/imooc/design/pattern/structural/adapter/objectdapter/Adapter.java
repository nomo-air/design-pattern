package com.imooc.design.pattern.structural.adapter.objectdapter;


public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
