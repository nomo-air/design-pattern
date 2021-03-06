package com.imooc.design.pattern.structural.flyweight;

public class Test {
    private static final String departments[] = {"AI", "QA", "BI", "DB"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }

        // Integer 测试
        Integer a = Integer.valueOf(100);
        Integer b = 100;
        System.out.println("a == b：" + (a == b));


        Integer c = Integer.valueOf(1000);
        Integer d = 1000;
        System.out.println("c == d：" + (c == d));
    }
}

