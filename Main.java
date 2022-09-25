package org.example.hello_world;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Input

        Scanner sc = new Scanner(System.in);
        System.out.print("Szia, légyszíves add meg a neved!");
        System.out.print("\n");
        String str = sc.nextLine();
        System.out.println("Válassz nyelvet! (hu, en, haw) ");
        String str2 = sc.nextLine();

        //Sets the language of the user
        switch (str2) {
            case " ": System.out.println("Szia, " + str + "!");
            break;
            case "hu":
                System.out.println("Szia, " + str + "!");
                break;
            case "eng":
                System.out.println("Hello, " + str + "!");
                break;
            case "haw":
                System.out.println("Aloha, " + str + "!");
                break;
            default:
                System.out.println("Ismeretlen nyelv!");

        }
    }
}
