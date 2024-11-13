package com.socialmedia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {
    private String name;
    private List<String> friends;
    private List<String> posts;

    public User(String name, String friends, String posts) {
        this.name = name;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public List<String> getPosts() {
        return posts;
    }

    public void setPosts(List<String> posts) {
        this.posts = posts;
    }

    public void addFriends(List<String>friendList, String friendName) {
        if (friendList.contains(friendName)) {
            System.out.println(friendName + " is already your friend.");
        } else {
            System.out.println(friendName + " was added to your friends list.");
        }
    }

    public void friendsList () {
        List<String> friendList = new ArrayList<>();
    }

    public void removeFriend (List<String>friendList, String friendName) {
        if (friendList.contains(friendName)) {
            friendList.remove(friendName);
            System.out.println(friendName + " has been removed.");
        } else {
            System.out.println(friendName + " could not be removed because is not in your list.");
        }
    }


    public void postsList() {
        List<String> post = new ArrayList<>();

        post.add("De vacaciones en Jamaica ;)");
        post.add("Jugando a los Sims 2!");
        post.add("Día nublado...");

        for (int i= 0; i < post.size(); i++){
            System.out.println("lucia9 posted: " + post.get(i));
        }
    }

}