package com.imooc.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class ArticleApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getArticle() + "含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getArticle() + "不含有手记，不批准，流程结束");
        }
    }
}
