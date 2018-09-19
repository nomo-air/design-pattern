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

    // 可以防止序列化破坏单例
    private Object readResolve() {
        return hungrySingleton;

    }

}
