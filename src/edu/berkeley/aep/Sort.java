package edu.berkeley.aep;

// understand which one is the best one
public class Sort<T extends Bestable> {
    private final T[] quantities;
    public Sort(T... list){
        this.quantities = list;
    }

    public T findTheBest() {
        var best = quantities[0];
        for(T b:quantities)
            if(b.betterThan(best))
                best = b;

        return best;
    }
}
