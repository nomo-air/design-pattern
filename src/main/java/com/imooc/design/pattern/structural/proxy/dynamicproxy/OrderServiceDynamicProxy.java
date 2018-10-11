package com.imooc.design.pattern.structural.proxy.dynamicproxy;

import com.imooc.design.pattern.structural.proxy.Order;
import com.imooc.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object object) {
        System.out.println("进入动态代理before方法");
        int userId = 0;
        if (object instanceof Order) {
            Order order = (Order) object;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到db，" + dbRouter + "，处理数据");
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("进入动态代理after方法");
    }
}
