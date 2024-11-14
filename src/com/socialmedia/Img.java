package com.socialmedia;

class Img extends Posts {
    private String title;
    private int width;
    private int length;

    public Img(String title, int width, int length) {
        super();
        this.title = title;
        this.width = width;
        this. length = length;
    }

    public String getTitle(){
        return title;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
