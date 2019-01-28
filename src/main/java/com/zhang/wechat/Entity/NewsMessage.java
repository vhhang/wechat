package com.zhang.wechat.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NewsMessage extends BaseMessage {
    private String articleCount;
    private List<Article> articles = new ArrayList<Article>();

    public String getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(String articleCount) {
        this.articleCount = articleCount;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "NewsMessage{" +
                "articleCount='" + articleCount + '\'' +
                ", articles=" + articles +
                "} " + super.toString();
    }

    public NewsMessage(Map<String, String> requestMap, String articleCount, List<Article> articles) {
        super(requestMap);
        this.setMsgType("news");
        this.articleCount = articleCount;
        this.articles = articles;
    }
}
