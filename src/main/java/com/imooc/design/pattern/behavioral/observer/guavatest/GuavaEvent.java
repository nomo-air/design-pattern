package com.imooc.design.pattern.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    @Subscribe
    public void subscribexa(String str) {
        // 业务逻辑
        System.out.println("执行subscribexa方法，传入的参数是：" + str);
    }
}
