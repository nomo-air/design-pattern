package com.imooc.design.pattern.creational.singleton;


public class MyThread implements Runnable {
    @Override
    public void run() {
        // LazySingleton instance = LazySingleton.getInstance();
        // LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        // StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        ContainerSingleton.putInstance("object", new Object());
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName() + "，" + instance);
    }
}
