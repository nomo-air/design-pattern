package com.imooc.design.pattern.structural.proxy;

public class OrderServiceImpl implements IOrderService{

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        // spring会自己注入
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
