package com.imooc.design.pattern.structural.bridge;


/**
 * 定期账号
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccout() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
