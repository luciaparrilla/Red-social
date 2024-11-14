package com.socialmedia;

class Video extends Posts {
    private String title;
    private String quality;
    private int duration;

    public Video (String title, String quality, int duration) {
        super();
        this.title = title;
        this.quality = quality;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getQuality() {
        return quality;
    }

    public int getDuration() {
        return duration;
    }

}
