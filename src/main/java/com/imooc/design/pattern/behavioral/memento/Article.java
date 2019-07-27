package com.imooc.design.pattern.behavioral.memento;

public class Article {
    private String titile;
    private String content;
    private String imgs;

    public Article(String titile, String content, String imgs) {
        this.titile = titile;
        this.content = content;
        this.imgs = imgs;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public ArticleMemento saveToMemeto() {
        ArticleMemento articleMemento = new ArticleMemento(this.titile, this.content, this.imgs);
        return articleMemento;
    }

    public void undoFromMemento(ArticleMemento articleMemento) {
        this.titile = articleMemento.getTitile();
        this.content = articleMemento.getContent();
        this.imgs = articleMemento.getImgs();
    }

    @Override
    public String toString() {
        return "Article{" +
                "titile='" + titile + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
