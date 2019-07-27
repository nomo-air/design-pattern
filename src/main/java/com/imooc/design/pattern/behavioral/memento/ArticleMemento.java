package com.imooc.design.pattern.behavioral.memento;

public class ArticleMemento {
    private String titile;
    private String content;
    private String imgs;

    public ArticleMemento(String titile, String content, String imgs) {
        this.titile = titile;
        this.content = content;
        this.imgs = imgs;
    }

    public String getTitile() {
        return titile;
    }


    public String getContent() {
        return content;
    }


    public String getImgs() {
        return imgs;
    }


    @Override
    public String toString() {
        return "ArticleMemento{" +
                "titile='" + titile + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
