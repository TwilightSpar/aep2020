package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureTest {

    @Test
    public void TwoHundredTwentyOneFahrenheitEqualsOneHundredCentigrade(){
        TemperatureQuantity _212 = new TemperatureQuantity(212, TemperatureQuantity.TemperatureUnit.Fahrenheit);
        TemperatureQuantity _100 = new TemperatureQuantity(100, TemperatureQuantity.TemperatureUnit.Centigrade);
        assertEquals(_212, _100.convert());
    }

    @Test
    public void ThirtyTwoFahrenheitEqualsZeroCentigrade(){
        TemperatureQuantity _32 = new TemperatureQuantity(32, TemperatureQuantity.TemperatureUnit.Fahrenheit);
        TemperatureQuantity _0 = new TemperatureQuantity(0, TemperatureQuantity.TemperatureUnit.Centigrade);
        assertEquals(_32, _0.convert());
    }

    @Test
    public void AHundredDegreeAddZeroDegreeEqualsFiftyDegree(){
        TemperatureQuantity _100 = new TemperatureQuantity(100, TemperatureQuantity.TemperatureUnit.Centigrade);
        TemperatureQuantity _0 = new TemperatureQuantity(0, TemperatureQuantity.TemperatureUnit.Centigrade);
        TemperatureQuantity _50 = new TemperatureQuantity(50, TemperatureQuantity.TemperatureUnit.Centigrade);

        assertEquals(_50, _100.add(_0));
    }
}
