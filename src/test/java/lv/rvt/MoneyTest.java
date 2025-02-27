package lv.rvt;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import lv.rvt.java.mooc.Money;
import static org.junit.Assert.assertEquals;

public class MoneyTest {

    @Test
    public void testMoneyCreation() {
        Money money1 = new Money(5, 50);
        assertEquals(5, money1.euros());
        assertEquals(50, money1.cents());

        Money money2= new Money(1, 5034);
        assertEquals(51, money1.euros());
        assertEquals(34, money1.cents());
    }

    @Test
    public void testMoneyCreationUsingNegativeParams() {
        Money money1 = new Money(-5, 50);
        assertEquals(0, money1.euros());
        assertEquals(0, money1.cents());

        Money money2 = new Money(0, -50);
        assertEquals(0, money2.euros());
        assertEquals(0, money2.cents());

        Money money3 = new Money(-2, -50);
        assertEquals(0, money3.euros());
        assertEquals(0, money3.cents());
    }

    @Test
    public void testPlus() {
        Money money1 = new Money(5, 50);
        Money money2 = new Money(3, 75);
        Money result = money1.plus(money2);
        assertEquals(9, result.euros());
        assertEquals(25, result.cents());
    }

    @Test
    public void testMinus() {
        Money money1 = new Money(5, 50);
        Money money2 = new Money(3, 75);
        Money result1 = money1.minus(money2);
        assertEquals(1, result1.euros());
        assertEquals(75, result1.cents());

        Money money3 = new Money(2, 50);
        Money money4 = new Money(3, 75);
        Money result2 = money3.minus(money4);
        assertEquals(0, result2.euros());
        assertEquals(0, result2.cents());
    }

    @Test
    public void testLessThan() {
        Money money1 = new Money(5, 50);
        Money money2 = new Money(7, 25);
        assertTrue(money1.lessThan(money2));
        assertFalse(money2.lessThan(money1));
    }
}


