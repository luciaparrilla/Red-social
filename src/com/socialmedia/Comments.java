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

    public User getUser(){
        return author;
    }

    public String getText() {
        return text;
    }

    public Posts getPosts(){
        return post;
    }

    public void display() {
        System.out.println("    " + author.getName() + " comentó: " + text);
    }

    public Posts getPost() {
        return post;
    }

    public void commentOnFriendPost(User currentUser, Scanner scanner) {
        System.out.println("Tus amigos:");
        List<User> friends = currentUser.getFriends();
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(i + 1 + ". " + friends.get(i).getName());
        }

        System.out.print("Elige un amigo para ver sus posts (número): ");
        int friendChoice = scanner.nextInt();
        scanner.nextLine();

        User friend = friends.get(friendChoice - 1);

        System.out.println("Posts de " + friend.getName() + ":");
        List<Posts> friendPosts = friend.getPosts();
        for (int i = 0; i < friendPosts.size(); i++) {
            System.out.println(i + 1 + ". " + friendPosts.get(i).getContent());
        }

        System.out.print("Elige un post para comentar (número): ");
        int postChoice = scanner.nextInt();
        scanner.nextLine();

        Posts selectedPost = friendPosts.get(postChoice - 1);


        System.out.print("Escribe tu comentario: ");
        String commentText = scanner.nextLine();


        Comments newComment = new Comments(currentUser, commentText, selectedPost);


        selectedPost.addComment(newComment);

        System.out.println("Comentario agregado correctamente.");
    }
}



