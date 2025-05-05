package edu.estatuas.rick;

public class CreditCard implements PaymentMethod {

    private final String owner;
    private final String number;
    private  double credit = 3000;
    private String SYMBOL = "EZI";

    CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;

    }

    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public String number() {
        return this.number;
    }
    @Override
    public double credit() {
        return this.credit;

    }
    String getSYMBOL() {
        return this.SYMBOL;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public boolean pay(double amount) {

        if (this.credit >= amount) {
            this.credit -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "owner: " + this.getOwner() + "\n number: " + this.number() + "\n credit: " + this.credit() + this.getSYMBOL();
    }


}
