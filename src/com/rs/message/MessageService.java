package com.rs.message;

import java.util.Scanner;

public class MessageService {
    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Message: ");
        String message = sc.nextLine();

        System.out.println("Author: ");
        String author = sc.nextLine();
        Message registry = new Message();
        registry.setMessage(message);
        registry.setAuthor(author);

        MessageDAO.createMessageDB(registry);
    }
    public static void listMessage(){
        MessageDAO.readMessageDB();

    }
    public static void deleteMesssage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new  message to update: ");
        String message = sc.nextLine();

        System.out.println("Enter the ID of message to update: ");
        int id_message = sc.nextInt();

        Message updates = new Message();
        updates.setMessage(message);
        updates.setId_message(id_message);
        MessageDAO.updateMessageDB(updates);

    }
    public static void updateMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID of message to delete: ");
        int id_message = sc.nextInt();
        MessageDAO.deleteMessageDB(id_message);

    }
}
