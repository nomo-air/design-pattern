package com.imooc.design.pattern.creational.singleton;


public class MyThread implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + "，" + lazySingleton);
    }
}
