package com.example.zeyad.recyclerviewtest;

/**
 * Created by zeyad on 08/02/17.
 * This class represents the news object.
 * It hold the data and has a setters and getters to pass the data and retrieve the data from it.
 */

public class News {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    private String title;
    private String date;
    private String imageURL;

}
