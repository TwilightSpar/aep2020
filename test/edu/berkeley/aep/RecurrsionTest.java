package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecurrsionTest {
    @Test
    public void reverseAPPLEShouldBeELPPA(){
        String string = "APPLE";
        assertEquals("ELPPA", ReverseString.reverse(string));
    }
}
