package com.imooc.design.principle.compositionaggregation;

public class MySQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
