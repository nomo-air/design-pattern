package com.imooc.design.pattern.creational.singleton;

public class Test {
    public static void main(String[] args) {
        Thread myThread1 = new Thread(new MyThread());
        Thread myThread2 = new Thread(new MyThread());
        myThread1.start();
        myThread2.start();
        System.out.println("程序执行结束");
    }
}
