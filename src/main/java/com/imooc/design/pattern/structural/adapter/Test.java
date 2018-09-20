package com.imooc.design.pattern.structural.adapter;

public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdpter();
        dc5.outputDC5V();
    }
}
