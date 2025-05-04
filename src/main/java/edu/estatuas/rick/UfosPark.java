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
        this.flota.put(null,ufo);
    }
    public void assignUfo(String user,String ufo){
        this.flota.put(user,ufo);
    }

    public String getUfoOf(String ufo){
        return this.flota.get(ufo);
    }
    public String getUfo(){

        String ufoSelected ="";
        for (Map.Entry<String,String> entry : this.flota.entrySet()) {
            if(entry.getKey()==null) {
                ufoSelected = entry.getValue();
            }
        }
        return ufoSelected;
    }

    @Override
    public void dispatch(CreditCard card) {

        if (card.credit() > 500 && !flota.containsKey(card.number())) {
            card.setCredit(card.credit() - 500);
            assignUfo(card.number(),getUfo());

        }
        else {
            card.setCredit(card.credit());
        }
    }
}
