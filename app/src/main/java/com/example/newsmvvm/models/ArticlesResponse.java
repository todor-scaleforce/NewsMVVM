package com.example.newsmvvm.models;

import java.util.ArrayList;

/**
 * Created by tosheto on 2/6/2018.
 */

public class ArticlesResponse {

    private String status;
    private int totalResults;
    private ArrayList<Article> articles;


    public ArticlesResponse() {
    }

    public ArticlesResponse(String status, int totalResults, ArrayList<Article> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }
}
