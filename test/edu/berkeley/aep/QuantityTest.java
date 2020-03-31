package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityTest {
    // add method in Quantity class
    @Test
    public void twoInchAddTwoInchShouldEqualFourInch() throws Exception {
        assertEquals(new ArithmeticQuantity(4,Unit.INCH),new ArithmeticQuantity(2,Unit.INCH).add(new ArithmeticQuantity(2,Unit.INCH)));
    }

    @Test
    public void twoTableSpoonAddOneOZShouldEqualTwelveTeaSpoon() throws Exception {
        assertEquals(new ArithmeticQuantity(12,Unit.TEASPOON),new ArithmeticQuantity(2,Unit.TABLESPOON).add(new ArithmeticQuantity(1,Unit.OZ)));
    }

    @Test(expected = Exception.class)
    public void twoTeaSpoonAddOneInchShouldThrowException() throws Exception {
        assertEquals(new ArithmeticQuantity(12,Unit.TEASPOON),new ArithmeticQuantity(2,Unit.TABLESPOON).add(new ArithmeticQuantity(1,Unit.INCH)));
    }

    @Test
    public void ThirtyTwoFahrenheitEqualsZeroCentigrade(){
        ScaleQuantity _32 = new ScaleQuantity(32, Unit.FAHRENHEIT);
        ScaleQuantity _0 = new ScaleQuantity(0, Unit.CELSIUS);
        assertEquals(_32, _0);
    }

    @Test
    public void AHundredDegreeAddZeroDegreeEqualsFiftyDegree() throws Exception{
        ArithmeticQuantity _50 = new ArithmeticQuantity(50, Unit.FOOT);
        ArithmeticQuantity _12 = new ArithmeticQuantity(12, Unit.INCH);
        ArithmeticQuantity _51 = new ArithmeticQuantity(51, Unit.FOOT);
        assertEquals(_51, _50.add(_12));
    }


    @Test
    public void testBetterThan(){
        var quantity_a = new ScaleQuantity(200, Unit.INCH);
        var quantity_b = new ScaleQuantity(12, Unit.FOOT);
        assertEquals(quantity_a.betterThan(quantity_b), true);
    }


}
