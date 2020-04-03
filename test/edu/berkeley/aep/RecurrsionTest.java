package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecurrsionTest {
    @Test
    public void reverseAPPLEShouldBeELPPA(){
        String string = "APPLE";
        assertEquals("ELPPA", ReverseString.reverse(string));
    }
    @Test
    public void reverseNoneShouldBeNone(){
        String string = "";
        assertEquals("", ReverseString.reverse(string));
    }
}
