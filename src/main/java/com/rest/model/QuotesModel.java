package com.rest.model;

public class QuotesModel {

    private String time;
    private String price;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public QuotesModel() {
    }

    public QuotesModel(String time, String price) {
        this.time = time;
        this.price = price;
    }

}
