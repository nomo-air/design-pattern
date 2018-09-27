package com.imooc.design.pattern.structural.proxy.staticproxy;

import com.imooc.design.pattern.structural.proxy.IOrderService;
import com.imooc.design.pattern.structural.proxy.Order;
import com.imooc.design.pattern.structural.proxy.OrderServiceImpl;
import com.imooc.design.pattern.structural.proxy.db.DataSourceContextHolder;


public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod();
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到db，" + dbRouter + "，处理数据");
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        afterMethod();
        return iOrderService.saveOrder(order);
    }

    private void beforeMethod() {
        System.out.println("进入静态代理before方法");
    }

    private void afterMethod() {
        System.out.println("进入静态代理after方法");
    }
}
