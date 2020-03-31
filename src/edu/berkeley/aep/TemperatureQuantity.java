package edu.berkeley.aep;

// understand how to change C to F
public class TemperatureQuantity {  // Temperature is scales quantity
    enum TemperatureUnit {
        Centigrade,
        Fahrenheit
    }

    public double value;
    TemperatureUnit type;

    TemperatureQuantity(double value, TemperatureUnit type){
        this.value = value;
        this.type = type;
    }

    public TemperatureQuantity convert(){
        if(type == TemperatureUnit.Centigrade) {
            this.type = TemperatureUnit.Fahrenheit;
            this.value = this.value * 9 / 5 + 32;
        }
        else{
            this.type = TemperatureUnit.Centigrade;
            this.value = (this.value-32) * 5 / 9;
        }
        return this;
    }

    public TemperatureQuantity add(TemperatureQuantity other) throws IllegalArgumentException{
        if(this.type != other.type)
            throw new IllegalArgumentException("wrong type");
        this.value = (this.value + other.value) / 2;
        return this;
    }

    @Override
    public boolean equals(Object other) {
        //check if same object
        if(other == this) return true;
        //check if passed in is in same type
        //instanceof returns true if pass in subclass
        if(!(other instanceof TemperatureQuantity)) return false;

        // this is important part! no if/else parts
        TemperatureQuantity otherQuantity = (TemperatureQuantity) other;
        if(!this.type.equals(otherQuantity.type))
            return false;
        else
            return this.value == (otherQuantity).value;
    }
}
