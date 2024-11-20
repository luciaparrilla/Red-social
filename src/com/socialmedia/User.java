package com.socialmedia;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

class User {
    private String name;
    private List<Posts> posts;
    private List<User> friends;

    public User(String name) {
        this.name = name;
        this.posts = new ArrayList<>();
        this.friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void createPost(String content, String postType) {
        Posts newPost = null;

        switch (postType.toLowerCase()) {
            case "texto":
                newPost = new Text(this, content);
                break;
            case "imagen":
                newPost = new Img(this, content, 1080, 1080);
                break;
            case "video":
                newPost = new Video(this, content, "HD", "2 minutos");
                break;
            default:
                System.out.println("Tipo de post no válido.");
                return;
        }
        posts.add(newPost);
        newPost.display();
        //System.out.println("Post creado correctamente");
    }

    public void displayPosts() {
        if (posts.isEmpty()) {
            System.out.println(name + " no tiene publicaciones.");
        } else {
            for (Posts post : posts) {
                post.display();
            }
        }
    }

    public void displayFriendsPosts() {
        if (friends.isEmpty()) {
            System.out.println(name + " no tiene amigos.");
        } else {
            for (User friend : friends) {
                System.out.println("\nPosts de " + friend.getName() + ":");
                friend.displayPosts();
            }
        }
    }

    public void commentOnPost(Posts post, String commentText) {
        Comments comment = new Comments(this, commentText, post);
        post.addComment(comment);
        //System.out.println(name + " comentó en el post de " + post.getAuthor().getName());
    }

    public List<Posts> getPosts() {
        return posts;
    }

    public void addFriend(User friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
            System.out.println(friend.getName() + " ahora es tu amigo.");
        } else {
            System.out.println(friend.getName() + " ya es tu amigo.");
        }
    }

    public void removeFriend(User friend) {
        if (friends.contains(friend)) {
            friends.remove(friend);
            System.out.println(friend.getName() + " ha sido eliminado de tus amigos.");
        } else {
            System.out.println(friend.getName() + " no está en tu lista de amigos.");
        }
    }

    public List<User> getFriends() {
        return friends;
    }
}