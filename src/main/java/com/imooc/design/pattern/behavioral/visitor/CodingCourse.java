package com.imooc.design.pattern.behavioral.visitor;

public class CodingCourse extends Course{

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public void accept(IVisitor visitor) {
        // 权限校验也可以写在这里
        visitor.visit(this);
    }
}
