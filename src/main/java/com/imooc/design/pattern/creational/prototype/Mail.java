package com.imooc.design.pattern.creational.prototype;

public class Mail implements Cloneable {
    private String name;
    private String emailAddrss;
    private String content;

    public Mail() {
        System.out.println("调用Mail无参构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddrss() {
        return emailAddrss;
    }

    public void setEmailAddrss(String emailAddrss) {
        this.emailAddrss = emailAddrss;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddrss='" + emailAddrss + '\'' +
                ", content='" + content + '\'' +
                '}' + "，哈希码：" + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("调用克隆方法");
        return super.clone();
    }
}
