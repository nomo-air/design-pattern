package com.imooc.design.pattern.structural.flyweight;

public class Manager implements Employee {

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String title = "部门经理"; // 内部状态（不受外界变化）
    private String department; // 外部状态（以参数的形式传入）
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }
}
