package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortTest {

    @Test
    public void theBetterOne(){
        ScaleQuantity q1 = new ScaleQuantity(1, Unit.FOOT);
        ScaleQuantity q2 = new ScaleQuantity(3, Unit.INCH);
        ScaleQuantity q3 = new ScaleQuantity(1, Unit.MILE);
        assertEquals(new Sort(q1, q2, q3).findTheBest(), q3);
    }

}
