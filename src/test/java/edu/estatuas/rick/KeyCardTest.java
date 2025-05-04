package edu.estatuas.rick;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class KeyCardTest {

    private CreditCard card = null;

    @Before
    public void setupCard() {
        card = new CreditCard("Abradolf Lincler", "4916119711304546");
        assertNotNull("CreditCard creada", card);
    }
    @Test public void constructorTest() {
        assertNotNull("CreditCard creada", card);
        assertEquals("4916119711304546", card.number());
    }
    @Test
    public void payTestOKTest() {
        assertTrue(card.pay(2999.0));
        assertEquals(1.0, card.credit(), 0);
    }

   // @Test
    //public void payTestNOTOKZEROTest() {
      //  assertFalse(card.pay(2999.1));
        //assertEquals(3000, card.credit(), 0.1);
   //}

    @Test
    public void payTestNOTOKTest() {
        assertFalse(card.pay(4000));
        assertEquals(3000, card.credit(), 0);
    }

}