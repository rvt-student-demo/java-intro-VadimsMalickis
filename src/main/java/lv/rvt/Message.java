package lv.rvt;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write a message: ");
        String input = reader.nextLine();
        System.out.println(input);
    }
}
