package com.rs.message;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("________________________");
            System.out.println("Message Application");
            System.out.println("\n\n1. Create message \n2. List Message \n3. Delete message \n4. Update message \n5. Exit");
            option = sc.nextInt();

            switch (option){
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listMessage();
                    break;
                case 3:
                    MessageService.updateMessage();
                    break;
                case 4:
                    MessageService.deleteMesssage();
                    break;
                default:
                    break;

            }

        }while (option!=5);
    }
}
