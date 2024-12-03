package lv.rvt.exercises;

public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {
        this(name, 1);
    }

    public Pet(int age) {
        this("Jerry", age);
    }

    @Override
    public String toString() {
        return name + " (" + age + " years)";
    }
}
