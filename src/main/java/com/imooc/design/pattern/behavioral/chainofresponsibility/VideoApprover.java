package com.imooc.design.pattern.behavioral.chainofresponsibility;


import org.apache.commons.lang3.StringUtils;

public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getVideo() + "含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getVideo() + "不含有手记，不批准，流程结束");
        }
    }
}
