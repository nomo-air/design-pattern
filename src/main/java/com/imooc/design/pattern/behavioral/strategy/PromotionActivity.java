package com.imooc.design.pattern.behavioral.strategy;

public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excutePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
