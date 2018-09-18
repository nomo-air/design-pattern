package com.imooc.design.pattern.creational.factorymethod;

public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
