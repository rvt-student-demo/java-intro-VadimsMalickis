package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    // Mūsu galvenais konstruktors
    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, int age) {
        this(name, age, 0, 0);
    }

    public Person(String name) {
        // Visur varam izsaukt galveno konstruktoru
        this(name, 0, 0, 0);
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    // Getter and Setter methods
    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setName(String name) {
        this.name = name;
    }

    // Getter un Setter metodes
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void growOlder() {
        this.age++; // age = age + 1;
    }


    // Method overloading
    public void growOlder(int year) {
        this.age = this.age + year;
    }


    public int returnAge() {


        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

    public String toCsvRow() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this. height;
    }

    // Aizvietot ar toString metodi
    public String toString() {
        return this.name + ", age " + this.age + " years, my body mass index is " + this.bodyMassIndex();
    }
    


}
