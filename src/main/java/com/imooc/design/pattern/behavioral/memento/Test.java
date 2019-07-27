package com.imooc.design.pattern.behavioral.memento;

public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("如影随形的设计模式A", "手记内容A", "手记图片A");

        ArticleMemento articleMemento = article.saveToMemeto();

        articleMementoManager.addMemento(articleMemento);

        System.out.println("标题：" + article.getTitile() + " 内容：" + article.getContent() + "图片：" + article.getImgs() + " 暂存成功");
        System.out.println("手记完整信息：" + article);

        System.out.println("修改手记start");

        article.setTitile("如影随形的设计模式B");
        article.setContent("手记内容B");
        article.setImgs("手记图片B");

        System.out.println("修改手记end");

        System.out.println("手记完整信息：" + article);

        articleMemento = article.saveToMemeto();
        articleMementoManager.addMemento(articleMemento);

        article.setTitile("如影随形的设计模式C");
        article.setContent("手记内容C");
        article.setImgs("手记图片C");

        System.out.println("暂存回退start");
        System.out.println("回退出栈1");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退end");
        System.out.println("手记完整信息：" + article);
    }
}
