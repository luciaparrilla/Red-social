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
        System.out.println("\n");


        Comments comment1 = new Comments ("me encanta este videoo!!", 14-07-2024, "sebas7");
        Comments comment2 = new Comments ("¡Avisa para la próxima!", 13-07-2024, "juanferrari");
        Comments comment3 = new Comments ("los Sims, ¡qué recuerdos!", 14-10-2024, "lawiescudero");
        Comments comment4 = new Comments ("al menos no llueve, jaja", 14-11-2024, "isidrouva");
        Comments comment5 = new Comments ("en Amsterdam está así todo el año xd", 14-07-2024, "sebas7");
        System.out.println("Comments to Post 1: \n" + comment1 + "\n" + comment2);
        System.out.println("\n");
        System.out.println("Comments to Post 2: \n" + comment3);
        System.out.println("\n");
        System.out.println("Comments to Post 3: \n" + comment4 + "\n" + comment5);
    }
}
