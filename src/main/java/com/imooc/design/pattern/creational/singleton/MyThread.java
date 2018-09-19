package com.imooc.design.pattern.creational.singleton;


public class MyThread implements Runnable {
    @Override
    public void run() {
        // LazySingleton instance = LazySingleton.getInstance();
        // LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "，" + instance);
    }
}
