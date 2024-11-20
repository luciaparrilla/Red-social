package com.socialmedia;

import java.util.Date;
import java.util.List;

class Video extends Posts {
    private String title;
    private String quality;
    private String duration;

    public Video(User author, String title, String quality, String duration) {
        super(author, "Title: " + title);
        this.title = title;
        this.quality = quality;
        this.duration = duration;
    }

    @Override
    public void display() {
        System.out.println("\nPost de video de " + author.getName() + ": " + content);
        System.out.println("Calidad: " + quality + ", Duración: " + duration);
    }
}