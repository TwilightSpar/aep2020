package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.*;

public class NotTest {
    @Test
    public void twoChancesWithTheSameProbabilityShouldBeEqual(){
        Event e1 = new Event(0.9);
        Event e2 = new Event(0.9);
        assertEquals(e1, e2);
    }

    @Test
    public void probabilityOfTheCoinTossShouldNotEqualCertainty(){
        Event e1 = new Event(0.9);
        Event e2 = new Event(1);
        assertNotEquals(e1.not(), e2.not());
    }

    @Test
    public void probabilityOfNotAShouldBeOneMinusProbabilityOfA(){
        double probability = 0.9;
        Event e1 = new Event(probability);
        Event e2 = new Event(1 - probability);
        assertEquals(e2, e1.not());
    }

    @Test
    public void probabilityOfAAndBShouldBeTheProduct(){
        Event e1 = new Event(0.3);
        Event e2 = new Event(0.4);
        Event e3 = new Event(0.12);
        assertEquals(e3, e1.and(e2));
    }

    @Test
    public void probabilityOfAOrB(){
        Event e1 = new Event(0.3);
        Event e2 = new Event(0.4);
        Event e3 = new Event(0.58);
        assertEquals(e3, e1.or(e2));
    }

    @Test
    public void DeMorganLaw(){
        Event e1 = new Event(0.3);
        Event e2 = new Event(0.4);
        Event e3 = e1.and(e2);
        Event e4 = e1.not().or(e2.not()).not();
        assertEquals(e3, e4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryingToCreateAnEvent(){
        var event = new Event(2);
    }
}
