package com.imooc.design.principle.liskovSubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
