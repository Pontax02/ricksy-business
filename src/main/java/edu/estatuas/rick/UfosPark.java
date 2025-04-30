package edu.estatuas.rick;

import java.util.ArrayList;
import java.util.List;

public class UfosPark implements GuestDispatcher {

    private int fee;
    private List<String> flota = new ArrayList<String>();

    public UfosPark() {}

    public void add(String ufo){
        this.flota.add(ufo);
    }






    @Override
    public void dispatch(CreditCard card) {

    }
}
