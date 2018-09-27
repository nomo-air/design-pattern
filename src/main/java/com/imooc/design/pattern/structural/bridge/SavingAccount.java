package com.imooc.design.pattern.structural.bridge;

/**
 * 活期账号
 */
public class SavingAccount implements Account{
    @Override
    public Account openAccout() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
