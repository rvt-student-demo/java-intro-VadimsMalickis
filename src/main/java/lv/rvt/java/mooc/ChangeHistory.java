package lv.rvt.java.mooc;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> records;

    public ChangeHistory() {
        this.records = new ArrayList<>();
    }

    public void add(double currentBalance) {
        this.records.add(currentBalance);
    }

    public void clear() {
        this.records.clear();
    }

    public double maxValue() {
        double max = this.records.get(0);
        for (double value : records) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        return 0.0;
    }

    public double average() {
        return 0.0;
    }

    @Override
    public String toString() {
        return this.records.toString();
    }
}
