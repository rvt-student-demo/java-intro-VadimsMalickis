package lv.rvt;

import java.util.*;

public class App 
{
    // Darbs pāros ar V. Uz.
    public static void main( String[] args ) {
        // Piemērs kā mēs izsaucam
        // metodes no Stars klases
        Stars.printStars();
    }

    // Custom method
    public static int getValue() {
        return 58;
    }

    public static void printStars(int number) {
        System.out.println("printStarts()");
        printSquare(0);

    }
    public static void printSquare(int size) {
        System.out.println("printSquare()");
        printRectangle(0, 0);
    }
    public static void printRectangle(int width, int height) {
        System.out.println("printRectangle()");
        printTriangle(0);
    }
    public static void printTriangle(int size) {
        System.out.println("printTriangle()");
    }
}
