package com.imooc.design.pattern.behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        User geely = new User("Geely");
        User tom = new User("Tom");

        geely.sendMessage("Hi Tom!");
        tom.sendMessage("Hi Geely!");
    }
}
