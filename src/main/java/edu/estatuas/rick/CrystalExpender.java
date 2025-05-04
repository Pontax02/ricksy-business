package edu.estatuas.rick;

public class CrystalExpender implements GuestDispatcher {

    public int stock;
    public double itemCost;

    public CrystalExpender(int stock, double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }


    public void buyStock(short amount) {
        this.stock -= amount;
    }

    @Override
    public void dispatch(CreditCard card){
        if(stock() >= 1 && card.credit() > getItemCost()) {
            buyStock((short) 1);
            card.pay(itemCost);
        }
    }
    @Override
    public String toString() {
        return "Stock: " + this.stock() + "\nItemCost: " + this.getItemCost();
    }

    public int stock() {
        return this.stock;
    }

    public double getItemCost() {
        return this.itemCost;
    }


}
