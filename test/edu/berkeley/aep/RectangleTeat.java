package edu.berkeley.aep;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RectangleTeat {
   @Test
    public void rectangleHasSideTwoShouldEqualFour(){
       Rectangle rectangle = new Rectangle(2,2);
       assertEquals(4.0, rectangle.area());
   }

}
