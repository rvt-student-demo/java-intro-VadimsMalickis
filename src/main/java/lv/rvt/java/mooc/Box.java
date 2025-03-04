package lv.rvt.java.mooc;

import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    public void add(Packable item) {
        this.items.add(item);
    }
    
    public double weight() {
        double totalWeight = 0;
        for (Packable item : this.items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: "
        + this.items.size()
        + ", total weight "
        + weight() + " kg"; 
    }
}
