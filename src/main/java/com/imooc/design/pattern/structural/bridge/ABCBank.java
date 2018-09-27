package com.imooc.design.pattern.structural.bridge;

public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccout(); // 委托
        return account;
    }
}
