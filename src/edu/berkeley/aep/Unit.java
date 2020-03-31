package edu.berkeley.aep;

//understand how to convert between different units
public enum Unit {  // these units are arithmetic quantity
    INCH(1,UnitType.LENGTH),
    FOOT(12,UnitType.LENGTH),
    YARD(36,UnitType.LENGTH),
    MILE(1760*36,UnitType.LENGTH),
    TEASPOON(1,UnitType.VOLUME),
    TABLESPOON(3,UnitType.VOLUME),
    OZ(6,UnitType.VOLUME),
    CUP(48,UnitType.VOLUME),
    FAHRENHEIT(5, UnitType.TEMPERATURE),
    CELSIUS(9, UnitType.TEMPERATURE)
    ;
    private enum UnitType { LENGTH, VOLUME, TEMPERATURE; ; }
    private final int conversionFactor;
    private final UnitType unitType;

    Unit(int conversionFactor, UnitType unitType){
        this.conversionFactor = conversionFactor;
        this.unitType = unitType;

    }

    double convertTo(Unit unit, double size) throws Exception {
        if (this.unitType != unit.unitType)
            throw new Exception("Cannot compare " + this.unitType + " to " + unit.unitType);
        else if(this.unitType != UnitType.TEMPERATURE)
            return size * this.conversionFactor / unit.conversionFactor;
        else if(this == FAHRENHEIT)
            return (size - 32) * this.conversionFactor / unit.conversionFactor;
        else
            return size * this.conversionFactor / unit.conversionFactor + 32;
    }

    public boolean ifSameUnitType(Unit otherUnit){ return this.unitType.equals(otherUnit.unitType); }

    public boolean ifUnitLength(){
        return this.unitType.equals("length");
    }
}

