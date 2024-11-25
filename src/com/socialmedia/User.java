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

    public void createTextPost (User author, String title) {
        Text textPost = new Text(author, title);
        posts.add(textPost);
        //textPost.display(); Comentado para que no se muestren los posts en cuanto ejecuto el main de SocialMedia, sino solo cuando los llamo en el case 2
    }

    public void createImgPost (User author, String title, int width, int height) {
        Img imagePost = new Img (author, title, width, height);
        posts.add(imagePost);
        //imagePost.display(); Comentado para que no se muestren los posts en cuanto ejecuto el main de SocialMedia, sino solo cuando los llamo en el case 2
    }

    public void createVideoPost (User author, String title, String quality, String duration) {
        Video videoPost = new Video (author, title, quality, duration);
        posts.add(videoPost);
        //videoPost.display(); Comentado para que no se muestren los posts en cuanto ejecuto el main de SocialMedia, sino solo cuando los llamo en el case 2
    }

    public void displayPosts() {
        if (posts.isEmpty()) {
            System.out.println(name + " no tiene publicaciones.");
        } else {
            System.out.println("Publicaciones de " + this.getName() + ":");
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
                System.out.println("\nPosts de " + getName() + ":");
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

 public static void main(String[] args) {
     User user1 = new User("Lucia9");
     User user2 = new User("JuanFerrari");
     User user3 = new User("LawiEscudero");

     boolean running = true;
     do {
         System.out.println("1.- Crear post de texto como Lucia9.");
         System.out.println("2.- Crear post de texto como JuanFerrari.");
         System.out.println("3.- Crear post de texto como LawiEscudero.");
         System.out.println("\n");
         System.out.println("4.- Crear post de imagen como Lucia9.");
         System.out.println("5.- Crear post de imagen como JuanFerrari.");
         System.out.println("6.- Crear post de imagen como LawiEscudero.");
         System.out.println("\n");
         System.out.println("7.- Crear post de video como Lucia9.");
         System.out.println("8.- Crear post de video como JuanFerrari.");
         System.out.println("9.- Crear post de video como LawiEscudero.");


         Scanner scanner = new Scanner(System.in);
         System.out.println("Indica el usuario que creará el post: ");
         int selection = scanner.nextInt();


         switch (selection) {
             case 1:
                 user1.createTextPost(user1, "Todo el día escuchando a Connie Converse :')");
                 break;

             case 2:
                 user2.createTextPost(user2, "He vuelto a verme Lilya 4-Ever...");
                 break;

             case 3:
                 user3.createTextPost(user3, "Jugando a los Sims");
                 break;

             case 4:
                 user1.createImgPost(user1, "Así se ve Boeza desde mi terraza (H)", 1000, 800);
                 break;

             case 5:
                 user2.createImgPost(user2, "He encontrado esta foto antigua de Paul McCartney", 500, 300);
                 break;

             case 6:
                 user3.createImgPost(user3, "Qué gracia me hace este meme :')", 800, 500);
                 break;

             case 7:
                 user1.createVideoPost(user1, "De vacaciones en Jamaica", "HD", "1:3 minutos");
                 break;

             case 8:
                 user2.createVideoPost(user2, "Recitando La chorrimanguera xd", "240pp", "2:54 minutos");
                 break;

             case 9:
                 user3.createVideoPost(user3, "Persecución policial en Bembibre", "HD", "3 minutos");
                 break;

             //Para ver los posts que se han ido creando:
             case 10:
                 user1.displayPosts();
                 user2.displayPosts();
                 user3.displayPosts();
             default:
                 System.out.println("No se puede crear post.");
         }
     }while(running);

 }

}