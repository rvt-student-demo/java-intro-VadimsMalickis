package lv.rvt.java.mooc;

public class PaymentCard {

    private double balance;

  public PaymentCard(double balance) {
      this.balance = balance;
  }

  public double balance() {
      return this.balance;
  }

  public void addMoney(double increase) {
      if (this.balance + increase > 150 ){
          this.balance = 150;   
      } else if (increase > 0 ){
          this.balance += increase;
      }
  }
  public boolean takeMoney(double amount) {
      if (this.balance - amount > 0){
          this.balance -= amount;
          return true;
      } else{
          return false;
      }
  }

    public void eatAffordably(){
        if (this.balance - 2.60 > 0 ){
            this.balance -= 2.60;
        }
    }

    public void eatHeartily(){
        if (this.balance - 4.60 > 0 ){
            this.balance -= 4.60;
        }
    }

    public String toString(){
        return "The card has a balance of " + this.balance + " euros" ;
    } 
  }

