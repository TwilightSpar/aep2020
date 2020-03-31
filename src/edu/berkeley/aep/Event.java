package edu.berkeley.aep;

/* understand the likelihood */
public class Event implements Bestable<Event> {
    final double probability;
    public Event(double v) {
        if(v > 1) throw new IllegalArgumentException("certainty larger than one");
        this.probability = v;
    }

    public Event not(){
        return new Event(1 - this.probability);
    }

    public Event and(Event second){
        return new Event(this.probability * second.probability);
    }

    public Event or(Event second){
        return new Event(1 - (1 - this.probability) * (1 - second.probability));  // simple version: this.probability+second.probability-this.probability*second.probability
    }

    @Override
    public boolean equals(Object other) {
        if(other == this) return true;
        else if(!(other instanceof Event)) return false;
//        return Double.compare(((Event) other).probability, probability) == 0;
        return Math.abs(((Event) other).probability - probability) <= 1E-7;  // Double compare function does not pass
    }

    @Override
    public int hashCode(){
        return Double.hashCode(probability);
    }

    @Override
    public boolean betterThan(Event other) {
        return this.probability > other.probability;
    }
}
