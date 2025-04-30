package edu.estatuas.rick;

public class CreditCard {

    private final String owner;
    private final String number;
    private double credit;
    private String SYMBOL;

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

    public String toString() {
        return "owner: " + this.getOwner() + " number: " + this.number();
    }

}
