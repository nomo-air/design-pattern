package com.imooc.design.principle.demeter;

import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourses(List<Course> courseList) {
        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
