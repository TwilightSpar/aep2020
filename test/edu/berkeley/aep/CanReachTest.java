package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CanReachTest {
    @Test
    public void eCanReache(){
        DirectedGraph d = new DirectedGraph();
        assertEquals(0, d.canReach(4, 4));
    }

    @Test
    public void hCanReachE(){
        DirectedGraph d = new DirectedGraph();
        assertEquals(true, d.canReach(7, 4)>=0);
    }

    @Test
    public void hCanReachEWith3Hops(){
        DirectedGraph d = new DirectedGraph();
        assertEquals(3, d.canReach(7, 4));
    }

    @Test
    public void cCanReachBWith2Hops(){
        DirectedGraph d = new DirectedGraph();
        assertEquals(2, d.canReach(2, 1));
    }
    @Test
    public void bCanReachCWith2Hops(){
        DirectedGraph d = new DirectedGraph();
        assertEquals(1, d.canReach(1, 2));
    }
}
