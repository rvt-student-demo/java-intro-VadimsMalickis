package lv.rvt.exercises;

public class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name is: " + this.name;
    }
}
