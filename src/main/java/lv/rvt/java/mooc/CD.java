package lv.rvt.java.mooc;

public class CD implements Packable {
    private String artist;
    private String name;
    private int year;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
    }
    @Override
    public double weight() {
        return 0.1;
    }
}
