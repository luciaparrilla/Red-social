package com.socialmedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocialMedia {
    public static void main(String[] args) {
        User user = new User("lucia9", "amigos", "posts");
        System.out.println("\nFRIENDS: " + "\n");
        List<String> friendList = new ArrayList<>();
        friendList.add("sebas7");
        friendList.add("juanitoferrari");
        friendList.add("lawiescudero");
        friendList.add("isidrouva");
        friendList.add("diego00");
        friendList.add("rosa_97");
        friendList.add("margarita29");
        friendList.add("luis16");
        friendList.add("joaquinbtc");
        friendList.add("david_oreo");

        for (int i= 0; i < friendList.size(); i++){
            System.out.println(friendList.get(i));
        }

        System.out.println("\n=========");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the name of the friend you want to remove: ");
        String friendRemove = scanner.nextLine();
        user.removeFriend(friendList, friendRemove);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Search for the user you want to add to your friends: ");
        String friendAdd = scanner.nextLine();
        user.addFriends(friendList, friendAdd);

        System.out.println("\n=========");

        System.out.println("\nPOSTS: " + "\n");
        user.postsList();
    }
}
