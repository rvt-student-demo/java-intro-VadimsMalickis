package lv.rvt;

public class Student {

    private int credits;

    public Student() {
        this.credits = 0;
    }
    
    public void play() {
        this.credits -= 8;
    }
}
