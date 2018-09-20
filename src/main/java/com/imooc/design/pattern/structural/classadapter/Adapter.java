package com.imooc.design.pattern.structural.classadapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
