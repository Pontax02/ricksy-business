package edu.estatuas.rick;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UfosPark implements GuestDispatcher {

    private int FEE = 500;
    public Map<String,String> flota = new HashMap<String,String>();

    public UfosPark() {}

    void add(String ufo){
        this.flota.put(ufo,null);
    }
    public void assignUfo(String ufo,String user){
        this.flota.put(ufo,user);
    }

    String getUfoOf(String user){
            String ufoSold = "";

                for (Map.Entry<String, String> entry : flota.entrySet()) {
                    if (entry.getValue() == user) {
                        ufoSold = entry.getKey();
                    }
                }

            return ufoSold;
    }
    public String getUfo(){

        String ufoSelected ="";
        for (Map.Entry<String,String> entry : this.flota.entrySet()) {
            if(entry.getValue() == null) {
                ufoSelected = entry.getKey();
            }
        }
        return ufoSelected;
    }

    @Override
    public void dispatch(CreditCard card) {
        if (this.flota.containsValue(null)) {
            if ((getUfoOf(card.number()) == "") && card.pay(FEE)) {
                assignUfo(getUfo(), card.number());

            } else {
                card.setCredit(card.credit());
            }
        }
    }

    @Override
    public String toString() {
        List<String> keyList = new ArrayList<>(this.flota.keySet());
        return keyList.toString();
    }
}
