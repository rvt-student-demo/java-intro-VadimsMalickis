package lv.rvt;

public class Student {

    private String name;

    private int credits;

    public Student(int credit) {
        this.credits = credit;
    }
    
    public void play() {
        this.credits -= 8;
    }

    @Override
    public String toString() {
        return "Student credits: " + this.credits;
    }
}
