package com.socialmedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocialMedia {
    public static void main(String[] args) {

        //poder ver los amigos que añado por pantalla en el case de ver amigos
        Scanner scanner = new Scanner(System.in);

        User user1 = new User("Lucia9");
        User user2 = new User("JuanFerrari");
        User user3 = new User("LawiEscudero");

        System.out.println("Para ti: ");

        user2.createVideoPost(user2, "De vacaciones en Balboa", "HD", "1:03 minutos.");
        user2.createTextPost(user2, "No me sale el acorde de B7");
        user3.createImgPost(user3, "Subiendo el puerto de Manzanal", 800, 500);
        user1.createTextPost(user1, "Todo el día escuchando a Connie Converse :')");
        user2.createTextPost(user2, "He vuelto a verme Lilya 4-Ever...");
        user3.createTextPost(user3, "Jugando a los Sims");
        user1.createImgPost(user1, "Así se ve Boeza desde mi terraza (H)", 1000, 800);
        user2.createImgPost(user2, "He encontrado esta foto antigua de Paul McCartney", 500, 300);
        user3.createImgPost(user3, "Qué gracia me hace este meme :')", 800, 500);
        user1.createVideoPost(user1, "De vacaciones en Jamaica", "HD", "1:3 minutos");
        user2.createVideoPost(user2, "Recitando La chorrimanguera xd", "240pp", "2:54 minutos");
        user3.createVideoPost(user3, "Persecución policial en Bembibre", "HD", "3 minutos");


        System.out.println("\nNotificaciones: " + "\n");
        user1.addFriend(user2);
        //user2.addFriend(user3);


        boolean running = true;
        do {
            System.out.println("\nMenú");
            System.out.println("1. Agregar un post");
            System.out.println("2. Ver posts");
            System.out.println("3. Comentar en un post");
            System.out.println("4. Ver comentarios de un post");
            System.out.println("5. Eliminar un comentario");
            System.out.println("6. Ver lista de amigos");
            System.out.println("7. Agregar amigo");
            System.out.println("8. Eliminar amigo");
            System.out.println("9. Salir");
            System.out.print("¿Qué quieres hacer?: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Indica el tipo de post (texto, imagen, video): ");
                    String postType = scanner.nextLine();


                    if (postType.equalsIgnoreCase("texto")) {
                        System.out.println("Escribe tu post: ");
                        String text = scanner.nextLine();
                        user1.createTextPost(user1, text);
                        System.out.println("Post creado correctamente.");
                    } else if (postType.equalsIgnoreCase("imagen")) {
                        System.out.println("Introduce el título de la imagen: ");
                        String imgTitle = scanner.nextLine();
                        System.out.print("Introduce la altura de la imagen: ");
                        int height = scanner.nextInt();
                        System.out.print("Introduce el ancho de la imagen: ");
                        int width = scanner.nextInt();
                        scanner.nextLine();
                        user1.createImgPost(user1, imgTitle, height, width);
                        System.out.println("Post creado correctamente.");
                    } else if (postType.equalsIgnoreCase("video")) {
                        System.out.println("Introduce el título del vídeo: ");
                        String videoTitle = scanner.nextLine();
                        System.out.print("Introduce la calidad del vídeo: ");
                        String quality = scanner.nextLine();
                        System.out.print("Introduce la duración del vídeo: ");
                        String duration = scanner.nextLine();
                        user1.createVideoPost(user1, videoTitle, quality, duration);
                        System.out.println("Post creado correctamente");
                    } else {
                        System.out.println("Tipo de post no válido.");
                    }
                    break;

                case 2:
                    System.out.println("\nVer publicaciones de:");
                    System.out.println("(1) Lucia9");
                    System.out.println("(2) JuanFerrari");
                    System.out.println("(3) LawiEscudero");
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
                    System.out.println("\nSelecciona el usuario para comentar:");
                    System.out.println("(1) Lucia9");
                    System.out.println("(2) JuanFerrari");
                    System.out.println("(3) LawiEscudero");
                    System.out.print("Selecciona una opción: ");
                    int commentUserChoice = scanner.nextInt();
                    scanner.nextLine();

                    Posts postToComment = null;
                    if (commentUserChoice == 1) {
                        System.out.println("Selecciona un post de " + user1.getName() + ":");
                        for (int i = 0; i < user1.getPosts().size(); i++) {
                            System.out.println("(" + (i + 1) + ") " + user1.getPosts().get(i).getContent());
                        }
                        System.out.print("Selecciona el número del post: ");
                        int postChoice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (postChoice >= 0 && postChoice < user1.getPosts().size()) {
                            postToComment = user1.getPosts().get(postChoice);
                        } else {
                            System.out.println("Post no válido.");
                        }
                    } else if (commentUserChoice == 2) {
                        System.out.println("Selecciona un post de " + user2.getName() + ":");
                        for (int i = 0; i < user2.getPosts().size(); i++) {
                            System.out.println("(" + (i + 1) + ") " + user2.getPosts().get(i).getContent());
                        }
                        System.out.print("Selecciona el número del post: ");
                        int postChoice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (postChoice >= 0 && postChoice < user2.getPosts().size()) {
                            postToComment = user2.getPosts().get(postChoice);
                        } else {
                            System.out.println("Post no válido.");
                        }
                    } else if (commentUserChoice == 3) {
                        System.out.println("Selecciona un post de " + user3.getName() + ":");
                        for (int i = 0; i < user3.getPosts().size(); i++) {
                            System.out.println("(" + (i + 1) + ") " + user3.getPosts().get(i).getContent());
                        }
                        System.out.print("Selecciona el número del post: ");
                        int postChoice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (postChoice >= 0 && postChoice < user3.getPosts().size()) {
                            postToComment = user3.getPosts().get(postChoice);
                        } else {
                            System.out.println("Post no válido.");
                        }
                    }

                    if (postToComment != null) {
                        System.out.println("Escribe tu comentario:");
                        String commentText = scanner.nextLine();
                        Comments comment = new Comments(user1, commentText, postToComment);
                        postToComment.addComment(comment);
                        System.out.println("Comentario agregado.");
                    } else {
                        System.out.println("No se ha podido comentar en el post.");
                    }
                    break;

                case 4:
                    System.out.println("\nSelecciona el usuario para ver los comentarios:");
                    System.out.println("(1) Lucia9");
                    System.out.println("(2) JuanFerrari");
                    System.out.println("(3) LawiEscudero");
                    System.out.print("Selecciona una opción: ");
                    int userChoiceForComments = scanner.nextInt();
                    scanner.nextLine();

                    Posts postToViewComments = null;
                    if (userChoiceForComments == 1) {
                        System.out.println("Selecciona un post de " + user1.getName() + ":");
                        for (int i = 0; i < user1.getPosts().size(); i++) {
                            System.out.println("(" + (i + 1) + ") " + user1.getPosts().get(i).getContent());
                        }
                        System.out.print("Selecciona el número del post: ");
                        int postChoice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (postChoice >= 0 && postChoice < user1.getPosts().size()) {
                            postToViewComments = user1.getPosts().get(postChoice);
                        } else {
                            System.out.println("Post no válido.");
                        }
                    } else if (userChoiceForComments == 2) {
                        System.out.println("Selecciona un post de " + user2.getName() + ":");
                        for (int i = 0; i < user2.getPosts().size(); i++) {
                            System.out.println("(" + (i + 1) + ") " + user2.getPosts().get(i).getContent());
                        }
                        System.out.print("Selecciona el número del post: ");
                        int postChoice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (postChoice >= 0 && postChoice < user2.getPosts().size()) {
                            postToViewComments = user2.getPosts().get(postChoice);
                        } else {
                            System.out.println("Post no válido.");
                        }
                    } else if (userChoiceForComments == 3) {
                        System.out.println("Selecciona un post de " + user3.getName() + ":");
                        for (int i = 0; i < user3.getPosts().size(); i++) {
                            System.out.println("(" + (i + 1) + ") " + user3.getPosts().get(i).getContent());
                        }
                        System.out.print("Selecciona el número del post: ");
                        int postChoice = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (postChoice >= 0 && postChoice < user3.getPosts().size()) {
                            postToViewComments = user3.getPosts().get(postChoice);
                        } else {
                            System.out.println("Post no válido.");
                        }
                    }

                    if (postToViewComments != null) {
                        System.out.println("Comentarios para el post: " + postToViewComments.getContent());
                        for (Comments comment : postToViewComments.getComments()) {
                            System.out.println(comment.getUser().getName() + ": " + comment.getText());
                        }
                    } else {
                        System.out.println("Post no encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("\nPosts:");
                    System.out.println("(1) Lucia9 - De vacaciones en Jamaica");
                    System.out.println("(2) JuanFerrari - Día nublado :/");
                    System.out.println("(3) LawiEscudero - Jugando a los Sims");
                    System.out.print("Selecciona un post: ");
                    int postToDeleteCommentChoice = scanner.nextInt();
                    scanner.nextLine();

                    Posts postToDeleteComment = null;
                    Comments commentToDelete = null;

                    if (postToDeleteCommentChoice == 1) {
                        postToDeleteComment = user1.getPosts().get(0);
                    } else if (postToDeleteCommentChoice == 2) {
                        postToDeleteComment = user2.getPosts().get(0);
                    } else if (postToDeleteCommentChoice == 3) {
                        postToDeleteComment = user3.getPosts().get(0);
                    }

                    if (postToDeleteComment != null) {
                        if (!postToDeleteComment.getComments().isEmpty()) {
                            System.out.println("Comentarios:");
                            for (int i = 0; i < postToDeleteComment.getComments().size(); i++) {
                                Comments c = postToDeleteComment.getComments().get(i);
                                System.out.println(i + 1 + ". " + c.getUser().getName() + ": " + c.getText());
                            }
                            System.out.print("Selecciona el número del comentario a eliminar: ");
                            int commentChoice = scanner.nextInt();
                            scanner.nextLine();
                            if (commentChoice > 0 && commentChoice <= postToDeleteComment.getComments().size()) {
                                commentToDelete = postToDeleteComment.getComments().get(commentChoice - 1);
                                postToDeleteComment.removeComment(commentToDelete);
                                System.out.println("Comentario eliminado.");
                            } else {
                                System.out.println("Número de comentario no válido.");
                            }
                        } else {
                            System.out.println("No hay comentarios para eliminar.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("\nLista de amigos de " + user1.getName() + ":");
                    for (User friend : user1.getFriends()) {
                        System.out.println(friend.getName());
                    }
                    break;

                case 7:
                    System.out.print("Ingresa el nombre del usuario que quieres añadir como amigo: ");
                    String friendName = scanner.nextLine();
                    if (friendName.equalsIgnoreCase("JuanFerrari")) {
                        user1.addFriend(user2);
                    } else if (friendName.equalsIgnoreCase("LawiEscudero")) {
                        user1.addFriend(user3);
                    } else {
                        System.out.println(friendName + " ahora es tu amigo.");
                    }
                    break;

                case 8:
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

                case 9:
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