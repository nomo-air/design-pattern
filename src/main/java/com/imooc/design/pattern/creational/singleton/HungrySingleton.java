package com.imooc.design.pattern.creational.singleton;

import java.io.Serializable;


public class HungrySingleton implements Serializable,Cloneable{

    private final static HungrySingleton hungrySingleton;

    static{
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    // 可以防止序列化破坏单例
    private Object readResolve(){
        return hungrySingleton;
    }

    // 防止克隆破坏单例
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
