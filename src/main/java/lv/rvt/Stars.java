package lv.rvt;

public class Stars {

    public static void christmasTree(int height) {
       
        for (int i = 0; i < height; i++) {
            printSpaces(height - i);
            printStars(i * 2 + 1);
            System.out.println();
         }
         int treeSize = 2;
         for (int i = 0; i < treeSize; i++) {
            printSpaces(height - 1);
            printStars(3);
            System.out.println();
         }
    }

    public static void printRightTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
            System.out.println();
         }
    }


    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
           printStars(size);
           System.out.println();
        }
    }

    public static void printRectangle(int widht, int height) {
        for (int i = 0; i < height; i++) {
            printStars(widht);
            System.out.println();
         }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
            System.out.println();
         }
    }

    private static void printStars(int number) {
        for (int i = 0; i < number; i++) {
         System.out.print("*");
        }
     }
     private static void printSpaces(int number) {
         for (int i = 0; i < number; i++) {
          System.out.print(" ");
         }
     }

}
