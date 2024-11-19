package com.socialmedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocialMedia {
    public static void main(String[] args) {

// //buscar herramientas en clase Utils para listar cosas y demás - showAndSelectFromList o algo así\\\\\\\\\

////////menú con submenús (posts+publicar, listar, etc; comentarios+listar, publicar, eliminar, etc.)

        Scanner scanner = new Scanner(System.in);

        User user1 = new User("Lucia9");
        User user2 = new User("JuanFerrari");
        User user3 = new User("LawiEscudero");


        System.out.println("\nNotificaciones: " + "\n");
        user1.addFriend(user2);
        user2.addFriend(user3);

        System.out.println("\nPara ti: ");

        user1.createPost("De vacaciones en Jamaica", "video");
        user2.createPost("Día nublado :/", "imagen");
        user3.createPost("Jugando a los Sims", "texto");


        Comments comment1 = new Comments(user2, "¡Qué envidia!", user1.getPosts().get(0));
        user1.getPosts().get(0).addComment(comment1);

        Comments comment2 = new Comments(user3, "Por aquí llueve, Juan...", user2.getPosts().get(0));
        user2.getPosts().get(0).addComment(comment2);

        Comments comment3 = new Comments(user1, "Qué recuerdos!!", user3.getPosts().get(0));

        boolean running = true;

        do {
            System.out.println("\nMenú");
            System.out.println("1. Agregar un post");
            System.out.println("2. Ver publicaciones");
            System.out.println("3. Comentar en un post");
            System.out.println("4. Ver publicaciones de tus amigos");
            System.out.println("5. Ver lista de amigos");
            System.out.println("6. Agregar amigo");
            System.out.println("7. Eliminar amigo");
            System.out.println("8. Salir");
            System.out.print("¿Qué quieres hacer?: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Indica el tipo de post (texto, imagen, video): ");
                    String postType = scanner.nextLine();
                    System.out.print("Escribe el título del post: ");
                    String content = scanner.nextLine();

                    if (postType.equalsIgnoreCase("texto") || postType.equalsIgnoreCase("imagen") || postType.equalsIgnoreCase("video")) {
                        user1.createPost(content, postType);
                        System.out.println("Post creado correctamente.");
                    } else {
                        System.out.println("Tipo de post no válido.");
                    }
                    break;

                case 2:
                    System.out.println("\nVer publicaciones de:");
                    System.out.println("1. Lucia9");
                    System.out.println("2. JuanFerrari");
                    System.out.println("3. LawiEscudero");
                    System.out.print("Selecciona una opción: ");
                    int userChoice = scanner.nextInt();
                    scanner.nextLine();


                    if (userChoice == 1) {
                        user1.displayPosts();
                    } else if (userChoice == 2) {
                        user2.displayPosts();
                    } else if (userChoice == 3) {
                        user3.displayPosts();
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;

                case 3:
                    System.out.println("\nComentar en un post de:");
                    System.out.println("Lucia9 (1)");
                    System.out.println("JuanFerrari (2)");
                    System.out.println("LawiEscudero (3)");
                    System.out.print("Selecciona una opción: ");
                    int commentUserChoice = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Escribe tu comentario: ");
                    String commentText = scanner.nextLine();


                   if (commentUserChoice == 1 && !user1.getPosts().isEmpty()) {
                       Posts postToComment = user1.getPosts().get(0);
                       user2.commentOnPost(postToComment, commentText);
                   } else if (commentUserChoice == 2 && !user2.getPosts().isEmpty()) {
                       Posts postToComment = user2.getPosts().get(0);
                       user1.commentOnPost(postToComment, commentText);
                   } else if (commentUserChoice == 3 && !user3.getPosts().isEmpty()) {
                       Posts postToComment = user3.getPosts().get(0);
                       user1.commentOnPost(postToComment, commentText);
                   } else {
                       System.out.println("Este usuario no tiene publicaciones.");
                }
                    break;

                case 4:
                    user1.displayFriendsPosts();
                    break;

                case 5:
                    System.out.println("\nLista de amigos de " + user1.getName() + ":");
                    for (User friend : user1.getFriends()) {
                        System.out.println(friend.getName());
                    }
                    break;

                case 6:
                    System.out.print("Ingresa el nombre del usuario que quieres añadirr como amigo: ");
                    String friendName = scanner.nextLine();
                    if (friendName.equalsIgnoreCase("JuanFerrari")) {
                        user1.addFriend(user2);
                    } else if (friendName.equalsIgnoreCase("LawiEscudero")) {
                        user1.addFriend(user3);
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case 7:
                    System.out.print("Ingresa el nombre del amigo que quieres eliminar: ");
                    String friendToRemove = scanner.nextLine();
                    if (friendToRemove.equalsIgnoreCase("JuanFerrari")) {
                        user1.removeFriend(user2);
                    } else if (friendToRemove.equalsIgnoreCase("LawiEscudero")) {
                        user1.removeFriend(user3);
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                    break;

                case 8:
                    //running = false;
                    System.out.println("Has cerrado sesión.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (running);

        scanner.close();
    }
}