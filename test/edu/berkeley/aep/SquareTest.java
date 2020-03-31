package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void testArea(){
        Square s1 = new Square(2);
        assertEquals(s1.area(), 4, 1E-6);
    }
    @Test
    public void testEqual(){
        Square s = new Square(2);
        Rectangle r = new Rectangle(2,2);
        assertEquals(s, r);
    }

    @Test
    public void testEqualOfMethod(){
        Rectangle r = new Rectangle(2,2);
        assertEquals(Rectangle.createSquare(2), r);
    }
}
