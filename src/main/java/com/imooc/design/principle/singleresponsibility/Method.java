package com.imooc.design.principle.singleresponsibility;

public class Method {
    private void updateUserInfo(String userName, String address, boolean type) {
        if (type) {
            // do something
        } else {
            // do somethinga
        }
    }
    // 应该拆分
}
