package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CanReachTest {
    @Test
    public void hCanReachE(){
        DirectedGraph d = new DirectedGraph();
        assertEquals(true, d.canReach(2, 4));
    }
}
