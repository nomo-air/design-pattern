package com.imooc.design.pattern.behavioral.mediator;

import java.util.Date;

public class StudeyGroup {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "]：" + message);
    }

}
