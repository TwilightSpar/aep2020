package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityTest {
<<<<<<< HEAD
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


=======

    @Test
    public void twelveInchesShouldEqualOneFoot() {
        var twelveInches = new Quantity(12, Unit.INCHES);
        var oneFoot = new Quantity(1, Unit.FEET);
        assertEquals(twelveInches, oneFoot);
    }

    @Test
    public void threeFeetShouldEqualOneYard() {
        var twelveInches = new Quantity(3, Unit.FEET);
        var oneFoot = new Quantity(1, Unit.YARD);
        assertEquals(twelveInches, oneFoot);
    }

    @Test
    public void oneThousandSevenHundredAndSixtyYardsShouldEqualOneMile() {
        var oneK760Yards = new Quantity(1760, Unit.YARD);
        var oneMile = new Quantity(1, Unit.MILE);
        assertEquals(oneK760Yards, oneMile);
    }

    @Test
    public void oneTbspShouldEqualThreeTsp() {
        var oneTbsp = new Quantity(1, Unit.TBSP);
        var threeTsp = new Quantity(3, Unit.TSP);
        assertEquals(oneTbsp, threeTsp);
    }

    @Test
    public void twoTbspShouldEqualOneOz() {
        var twoTbsp = new Quantity(2, Unit.TBSP);
        var oneOz = new Quantity(1, Unit.OZ);
        assertEquals(twoTbsp, oneOz);
    }

    @Test
    public void eightOzShouldEqualOneCup() {
        var twoTbsp = new Quantity(8, Unit.OZ);
        var oneOz = new Quantity(1, Unit.CUP);
        assertEquals(twoTbsp, oneOz);
    }

    @Test
    public void twoInchesPlusTwoInchesShouldEqualFourInches() {
        var twoInches = new Quantity(2, Unit.INCHES);
        assertEquals(new Quantity(4, Unit.INCHES), twoInches.add(twoInches));
    }

    @Test
    public void twoTablespoonsPlusOneOzShouldEqualTwelveTeaspoons() {
        var twoTbsp = new Quantity(2, Unit.TBSP);
        var oneOz = new Quantity(1, Unit.OZ);
        assertEquals(new Quantity(12, Unit.TSP), twoTbsp.add(oneOz));
    }

    @Test
    public void twoHundredAndTwelveFahrenheitShouldEqualOneHundredCelsius() {
        var twoHundredTwelveFahrenheit = new Quantity(212, Unit.FAHRENHEIT);
        var oneHundredCelsius = new Quantity(100, Unit.CELSIUS);
        assertEquals(twoHundredTwelveFahrenheit, oneHundredCelsius);
    }

    @Test
    public void thirtyTwoFahrenheitShouldEqualZeroCelsius() {
        var thirtyTwoFahrenheit = new Quantity(32, Unit.FAHRENHEIT);
        var zeroCelsius = new Quantity(0, Unit.CELSIUS);
        assertEquals(zeroCelsius, thirtyTwoFahrenheit);
    }
>>>>>>> 512bef54ed320fb9952b43a290e23c42885c4b5b
}
