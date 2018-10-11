package com.imooc.design.pattern.structural.proxy.dynamicproxy;

import com.imooc.design.pattern.structural.proxy.IOrderService;
import com.imooc.design.pattern.structural.proxy.Order;
import com.imooc.design.pattern.structural.proxy.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind() ;
        orderServiceDynamicProxy.saveOrder(order);
    }
}
