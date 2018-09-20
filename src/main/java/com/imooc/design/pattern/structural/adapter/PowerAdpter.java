package com.imooc.design.pattern.structural.adapter;

public class PowerAdpter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        // 假装有一个变压器
        int adapterOutput = adapterInput / 44;

        System.out.println("使用PowerAdpter输入AC：" + adapterInput + "，输出DC：" + adapterOutput);
        return adapterOutput;
    }
}
