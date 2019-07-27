package com.imooc.design.pattern.behavioral.strategy;

/**
 * 满减
 */
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200减20元");
    }
}
