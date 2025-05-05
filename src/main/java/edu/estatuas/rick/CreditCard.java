package edu.estatuas.rick;

public class CreditCard {

    private final String owner;
    private final String number;
    private  double credit = 3000;
    private String SYMBOL = "EZI";

    CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;

    }

    public String getOwner() {
        return this.owner;
    }

    public String number() {
        return this.number;
    }
    public double credit() {
        return this.credit;

    }
    String getSYMBOL() {
        return this.SYMBOL;
    }
    public void setCredit(double credit) {
        this.credit = credit;
    }

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
