package com.imooc.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {
    @Override
    public Map method() {
        System.out.println("子类method被执行");
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("message", "子类method被执行");
        return hashMap;
    }
}
