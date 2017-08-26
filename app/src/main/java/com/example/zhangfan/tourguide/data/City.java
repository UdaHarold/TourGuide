package com.example.zhangfan.tourguide.data;

/**
 * Created by Harold on 2017/8/22.
 */

public class City {
    private String title;
    private String description;
    private int imageSourceId;

    public City(String t, String desc, int imageID) {
        title = t;
        description = desc;
        imageSourceId = imageID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageSourceId() {
        return imageSourceId;
    }

}
