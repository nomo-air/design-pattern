package com.imooc.design.pattern.creational.singleton;

import java.io.Serializable;


public class HungrySingleton implements Serializable,Cloneable{

    private final static HungrySingleton hungrySingleton;

    static{
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
