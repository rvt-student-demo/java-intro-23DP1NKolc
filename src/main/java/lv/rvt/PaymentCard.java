package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }
    public void addMoney(double amount) {
        if(amount>=0){
        this.balance+=amount;
        }
    }
    public boolean takeMoney(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    
        
    }

}
