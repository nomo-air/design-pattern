package com.imooc.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

class Teacher implements Observer {
    private String tercherName;

    public Teacher(String tercherName) {
        this.tercherName = tercherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(tercherName + "老师的" + course.getCourseName() + "课程接收到一个" + question.getUserName() + "用户提交的问答：" + question.getQuestionContent());
    }
}
