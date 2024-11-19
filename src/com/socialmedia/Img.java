package com.socialmedia;

import java.util.Date;
import java.util.List;

class Img extends Posts {
    private String title;
    private int width;
    private int height;


    public Img(User author, String title, int width, int height) {
        super(author, "Imagen: " + title);
        this.title = title;
        this.width = width;
        this.height = height;
    }

    @Override
    public void display() {
        System.out.println("\nPost de imagen de " + author.getName() + ": " + content);
        System.out.println("Título: " + title);
        System.out.println("Dimensiones: " + width + "x" + height);
    }
}