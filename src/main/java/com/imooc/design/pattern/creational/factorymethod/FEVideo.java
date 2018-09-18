package com.imooc.design.pattern.creational.factorymethod;

public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制FE视频");
    }
}
