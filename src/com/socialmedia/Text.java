package com.socialmedia;

import java.util.Date;
import java.util.List;

class Text extends Posts {
    public Text(User author, String content) {
        super(author, "Title: ");
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("\nPost de texto de " + author.getName() + ": " + content);
    }
}
