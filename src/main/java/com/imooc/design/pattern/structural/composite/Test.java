package com.imooc.design.pattern.structural.composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 22);
        CatalogComponent mmallCourse1 = new Course("Java电商项目一期", 33);
        CatalogComponent mmallCourse2 = new Course("Java电商项目二期", 44);
        CatalogComponent designPattern = new Course("设计模式", 55);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录", 2);
        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录", 1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();

    }

}
