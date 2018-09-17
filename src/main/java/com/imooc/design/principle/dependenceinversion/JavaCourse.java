package com.imooc.design.principle.dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
