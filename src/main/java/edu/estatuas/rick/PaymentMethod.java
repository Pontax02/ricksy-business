package edu.estatuas.rick;

public interface PaymentMethod {
    String getOwner();

    String number();

    double credit();

    boolean pay(double amount);

    void setCredit(double credit);
}
