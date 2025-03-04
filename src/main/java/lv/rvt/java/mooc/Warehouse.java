package lv.rvt.java.mooc;

// W
public class Warehouse {
    private double capacity; // Noliktavas ietilpība
    private double balance; // Cik ir aizņemts vietas / Krava

    public Warehouse(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0; // Useless warehouse
        }
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }
    public double getCapacity() {
        return this.capacity;
    }
    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }
    public void addToWarehouse(double amount) {
        if (amount <= 0) {
            return; // break
        }
        if (amount <= this.howMuchSpaceLeft()) { // 
            this.balance = this.balance + amount; // this.balance += amount;
        } else {
            this.balance = this.capacity;
        }
    }
    public double takeFromWarehouse(double amount) {
        if (amount <= 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }
 
        this.balance = this.balance - amount;
        return amount;
    }

    @Override
    public String toString() {
        return "balance = "
            + getBalance() + ", space left " + howMuchSpaceLeft();
    }

}
