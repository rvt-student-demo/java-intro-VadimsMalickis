package lv.rvt;

public class Person {
    
    private String name;
    private int age;
    private int weight;
    private int height;
    private String address;
    
    
    public Person(
        String name,
        int age,
        int weight,
        int height,
        String address
    ) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.address = address;
    }
    
    public Person(String name, String address) {
        this(name, 0, 0, 0, address); // Izsaucam galveno konstruktoru
    }


    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeigth() {
        return this.height;
    }
    public String getAddress() {
        return this.address;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
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

    public final boolean isOfLegalAge() {
        return this.age >= 18;
    }
    public String toCsvRow() {
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height + ", " + this.address;
    }

    @Override
    public String toString() {
        return this.name + "\n\t" + this.address;
    }

    public boolean equals(Object obj) {
             // if the variables are located in the same position, they are equal
             if (this == obj) {
                return true;
            }
    
            // if the compared object is not of type Person, the objects are not equal
            if (!(obj instanceof Person)) {
                return false;
            }
    
            // convert the object into a Person object
            Person comparedPerson = (Person) obj;
            
            // if the values of the object variables are equal, the objects are equal
            if (this.name.equals(comparedPerson.name) &&
                this.age == comparedPerson.age &&
                this.weight == comparedPerson.weight &&
                this.height == comparedPerson.height) {
                return true;
            }
    
            // otherwise the objects are not equal
            return false;
    }
    
}
