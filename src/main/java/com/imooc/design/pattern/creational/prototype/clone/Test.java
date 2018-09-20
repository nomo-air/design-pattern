package com.imooc.design.pattern.creational.prototype.clone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday1 = new Date(0L);
        Pig pig1 = new Pig("佩奇",birthday1);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        System.out.println("修改克隆源的值后：");
        Date birthday2 = new Date();
        pig1.getBirthday().setTime(birthday2.getTime());
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
