package edu.estatuas.rick;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class KeyCardTest {

    private CreditCard card = null;

    @Before
    public void setupCard() {
        card = new CreditCard("Abradolf Lincler", "4916119711304546",3000);
        assertNotNull("CreditCard creada", card);
    }
    @Test public void constructorTest() {
        assertNotNull("CreditCard creada", card);
        assertEquals("4916119711304546", card.number());
    }


}