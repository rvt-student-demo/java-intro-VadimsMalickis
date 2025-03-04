package lv.rvt.connecticut;

public class Box {
    
    private double width;
    private double height;
    private double length;

    // Constructors
    public Box( double width, double height, double length ) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    
    public Box(double side) {
        // this() Šīs klases konstruktora metode
        this(side, side, side); // Ko mēs šeit daram?
    }

    public Box( Box oldBox ) {
        this.width = oldBox.width();
        this.height = oldBox.height();
        this.length = oldBox.length();
    }

    public Box biggerBox( Box oldBox )
    {
        return new Box(
            1.25 * oldBox.width(),
            1.25 * oldBox.height(),
            1.25 * oldBox.length()
        );
    }

    public double volume() {
        return this.length * this.width * this.height;
    }
    
    public double area() {
        return 2 * this.faceArea() + 2 * this.topArea() + 2 * this.sideArea() ;
        // return 2 * (this.faceArea() + this.topArea() + this.sideArea()) ;
    }

    public double length() {
        return this.length;
    }
    public double height() {
        return this.height;
    }
    public double width() {
        return this.width;
    }

    private double faceArea() {
        return this.width * this.height;
    }

    private double topArea() {
        return this.length * this.width;
    }

    private double sideArea() {
        return this.length * this.height;
    }

    public boolean nests(Box outerBox) {
        return this.length() <= outerBox.length()
            && this.width() <= outerBox.width()
            && this.height() <= outerBox.height();
    }
    
    @Override
    public String toString() {
        return "Box: " + this.width + "x" + this.height + "x" + this.length;
    }

}
