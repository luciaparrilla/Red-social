package com.socialmedia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Posts {
   protected String content;
   protected User author;
   protected List<Comments> comments;

    public Posts(User author, String content) {
        this.author = author;
        this.content = content;
        this.comments = new ArrayList<>();
    }

    public void addComment(Comments comment) {
        comments.add(comment);
    }

    public void removeComment(Comments comment) {
        comments.remove(comment);
    }

    public void display() {
        System.out.println("\nPost de " + author.getName() + ": " + content);
        System.out.println("Comentarios:");
        if (comments.isEmpty()) {
            System.out.println("    No hay comentarios.");
        } else {
            for (Comments comment : comments) {
                comment.display();
            }
        }
    }

    public List<Comments> getComments() {
        return comments;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }
}




