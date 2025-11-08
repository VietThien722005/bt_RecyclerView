package com.example.bt_recyclerview;

public class Food {
    private String title;
    private String desc;
    private int imageResId;

    public Food(String title, String desc, int imageResId) {
        this.title = title;
        this.desc = desc;
        this.imageResId = imageResId;
    }

    public String getTitle() { return title; }
    public String getDesc() { return desc; }
    public int getImageResId() { return imageResId; }
}
