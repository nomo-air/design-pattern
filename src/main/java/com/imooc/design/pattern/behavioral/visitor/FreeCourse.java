package com.imooc.design.pattern.behavioral.visitor;

import com.imooc.design.pattern.behavioral.visitor.Course;

public class FreeCourse extends Course {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
