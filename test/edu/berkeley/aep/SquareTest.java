package edu.berkeley.aep;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void squareOfSideThreeShouldHaveAreaNine(){
        Square square = new Square(3);
        TestCase.assertEquals(9.0, square.area());
    }
    @Test
    public void testArea(){
        Square s1 = new Square(2);
        assertEquals(s1.area(), 4, 1E-6);
    }
   
}
