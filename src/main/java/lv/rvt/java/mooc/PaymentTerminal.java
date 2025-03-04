package lv.rvt.java.mooc;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private double affordableMeal = 2.50;
    private double healthyMeal = 4.30;
    private double change = 0;
    
    public PaymentTerminal() {
        this.money = 1000;
    }
    
    public double eatAffordably(double payment){
        if (this.affordableMeal <= payment){
            this.money += payment - this.affordableMeal;
            this.affordableMeals++;
            this.change = payment - this.affordableMeal;
        } else if (this.affordableMeal > payment){
             this.change = payment;
        }
        return this.change;
    }

    public double eatHeartily(double payment){
        if (this.healthyMeal <= payment){
            this.money += payment - this.healthyMeal;
            this.heartyMeals++;
            this.change = payment - this.healthyMeal;
        } else if (this.healthyMeal > payment){
             this.change = payment;
        }
        return this.change;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= this.affordableMeal) {
            card.takeMoney(this.affordableMeal);
            this.money += this.affordableMeal;
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= this.healthyMeal) {
            card.takeMoney(this.healthyMeal);
            this.money += this.healthyMeal;
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
    }


    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
