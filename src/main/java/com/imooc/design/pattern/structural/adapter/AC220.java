package com.imooc.design.pattern.structural.adapter;

public class AC220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("输入交流电" + output + "V");
        return output;
    }
}
