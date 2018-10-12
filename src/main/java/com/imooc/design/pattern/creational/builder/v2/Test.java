package com.imooc.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("课程名字").buildCoursePPT("课程PPT")
                .buildCourseVideo("课程视频").build();
        System.out.println(course);
    }
}
