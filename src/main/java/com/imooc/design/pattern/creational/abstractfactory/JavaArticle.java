package com.imooc.design.pattern.creational.abstractfactory;

public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
