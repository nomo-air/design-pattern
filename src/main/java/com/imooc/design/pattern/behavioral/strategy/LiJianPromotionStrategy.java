package com.imooc.design.pattern.behavioral.strategy;

/**
 * 立减
 */
public class LiJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("立即促销，课程的价格直接减去配置的价格");
    }
}
