package lv.rvt;

public class Product {
    private double price;
    private int quantity;
    private String name;

    // Automatically created constructor method
    // by Java

    // Constructor
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initialName;
    }

    public void printProduct() {
        // Banana, price 1.1, 13 pcs
        System.out.println(
            this.name + ", price " + this.price + ", " + this.quantity + " pcs"
        );
    }
    
}
