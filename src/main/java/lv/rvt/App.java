package lv.rvt;

public class App 
{
    public static void main( String[] args ) {
        System.out.println("main()");
        printStars(0);
        System.out.println("Program end..");
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
