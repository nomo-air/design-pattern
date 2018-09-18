package com.imooc.design.pattern.creational.factorymethod;

public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
