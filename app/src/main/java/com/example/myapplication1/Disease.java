package com.example.myapplication1;

public class Disease {

    private int imageResId;
    private String name;
    private String description;

    public Disease(int imageResId,String name,String description){
        this.imageResId=imageResId;
        this.name=name;
        this.description=description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
