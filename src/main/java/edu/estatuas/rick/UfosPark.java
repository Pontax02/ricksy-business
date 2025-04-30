package edu.estatuas.rick;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UfosPark implements GuestDispatcher {

    private int fee;
    public Map<String,String> flota = new HashMap<String,String>();

    public UfosPark() {}

    public void add(String ufo){
        this.flota.put(ufo,null);
    }
    public void addClient(String ufo,CreditCard client){
        this.flota.put(ufo,client.number());
    }
    public String getUfoOf(String ufo){
        return this.flota.get(ufo);
    }

    @Override
    public void dispatch(CreditCard card) {
        if (card.credit() > 500){
            card.setCredit(card.credit() - 500);

        }
        else {
            card.setCredit(card.credit());
        }
    }
}
