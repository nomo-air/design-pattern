package com.imooc.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studyImoocCourse(new JavaCourse());
        geely.studyImoocCourse(new FECourse());
    }
}
