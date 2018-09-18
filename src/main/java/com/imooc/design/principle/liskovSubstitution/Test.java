package com.imooc.design.principle.liskovSubstitution;

public class Test {
    public static void resize(Rectangle rectangle) { // 如果用Quadrangle，quadrangle.setWidth()会报错
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width：" + rectangle.getWidth() + "，length：" + rectangle.getLength());
        }
        System.out.println("方法结束，width" + rectangle.getWidth() + "，length：" + rectangle.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }
}
