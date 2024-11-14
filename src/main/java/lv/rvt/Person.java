package lv.rvt;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    // Class constructor
    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }


    // Getter and Setter methods
    public String getName() {
        return this.name;
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
        if (this.age < 30) {
            this.age++;
        }
    }

    public int returnAge() {


        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

    // Aizvietot ar toString metodi
    public String toString() {
        return this.name + ", age " + this.age + " years, my body mass index is " + this.bodyMassIndex();
    }
    


}
