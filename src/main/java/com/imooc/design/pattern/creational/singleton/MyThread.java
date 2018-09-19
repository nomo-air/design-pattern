package com.imooc.design.pattern.creational.singleton;


public class MyThread implements Runnable {
    @Override
    public void run() {
        // LazySingleton lazySingleton = LazySingleton.getInstance();
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "，" + instance);
    }
}
