package edu.berkeley.aep;

//Understand quantity with value and unit
public class ArithmeticQuantity extends ScaleQuantity {

    public ArithmeticQuantity(double value, Unit unit) {
        super(value, unit);
    }

    public ScaleQuantity add(ScaleQuantity other) throws Exception {
        return new ArithmeticQuantity(this.value + other.convertTo(this.unit).value, this.unit);
    }
}
