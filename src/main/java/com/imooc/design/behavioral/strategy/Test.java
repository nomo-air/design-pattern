package com.imooc.design.behavioral.strategy;


public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
        promotionActivity618.excutePromotionStrategy();
        promotionActivity1111.excutePromotionStrategy();


        String promotionKey = "MANJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.excutePromotionStrategy();
    }
}
