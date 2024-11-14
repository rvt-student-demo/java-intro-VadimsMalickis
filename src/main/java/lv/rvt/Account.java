package lv.rvt;

public class Account {

    // klases mainīgos mums sauc par:
    // class properties
    // class attribues
    // class fields
    // mainīgie

    private double balance;
    private String owner;

    // Constructor
    // Inicializējam klases mainīgos
    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public double balance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
