package edu.berkeley.aep;

public class ScaleQuantity implements Bestable<ScaleQuantity> {
    protected final double value;
    protected final Unit unit;

    public ScaleQuantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other)  {
        //check if same object
        if(other == this) return true;
        //check if passed in is in same type
        //instanceof returns true if pass in subclass
        if(!(other instanceof ScaleQuantity)) return false;
        // this is important part! no if/else parts

        ScaleQuantity otherQuantity = (ScaleQuantity) other;
        try {
            return this.value == otherQuantity.convertTo(this.unit).value;
        } catch (Exception e) {
            return false;
        }
    }

    public ScaleQuantity convertTo(Unit unit) throws Exception {
        return new ScaleQuantity(this.unit.convertTo(unit, value), unit);
    }

    public boolean betterThan(ScaleQuantity other) {
        if(this.unit.ifSameUnitType(other.unit)){

            double quantityA = 0;
            try {
                quantityA = this.convertTo(other.unit).value;
            } catch (Exception e) {
                e.printStackTrace();
            }
            double quantityB = other.value;
            return quantityA > quantityB;
        }
        else
            return false;
    }


    @Override
    public int hashCode() {
        return Double.hashCode(value);
    }
}
