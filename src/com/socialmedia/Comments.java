package com.socialmedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Comments {
    private String text;
    private User author;
    private Posts post;

    public Comments(User author, String text, Posts post) {
        this.author = author;
        this.text = text;
        this.post = post;
    }

    public void display() {
        System.out.println("    " + author.getName() + " comenta: " + text);
    }

    public Posts getPost() {
        return post;
    }
}

