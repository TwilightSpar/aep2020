package edu.berkeley.aep;

<<<<<<< HEAD
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

=======
public enum Unit {

    INCHES(1, 0, "Inches", UnitType.LENGTH),
    FEET(12, 0, "Feet", UnitType.LENGTH),
    YARD(36, 0, "Yard", UnitType.LENGTH),
    MILE(1760 * 36, 0, "Mile", UnitType.LENGTH),
    TSP(1, 0, "Tsp", UnitType.VOLUME),
    TBSP(3, 0, "Tbsp", UnitType.VOLUME),
    OZ(6, 0, "Tsp", UnitType.VOLUME),
    CUP(48, 0, "Tsp", UnitType.VOLUME),
    FAHRENHEIT(5, -32, "F", UnitType.TEMPERATURE),
    CELSIUS(9, 0, "C", UnitType.TEMPERATURE);

    private enum UnitType { LENGTH, VOLUME, TEMPERATURE; }

    private final int inBaseUnits;
    private final int offset;
    private final UnitType type;
    private final String name;

    Unit(int inBaseUnits, int offset, String name, UnitType type) {
        this.inBaseUnits = inBaseUnits;
        this.offset = offset;
        this.type = type;
        this.name = name;
    }

    int convertTo(Unit unit, int size) throws Exception {
        if (unit.type != type)
            throw new Exception("Cannot compare " + type + " to " + unit.type);
        return (size + offset) * inBaseUnits / unit.inBaseUnits - unit.offset;
    }

    @Override
    public String toString() {
        return name;
    }
}
>>>>>>> 512bef54ed320fb9952b43a290e23c42885c4b5b
