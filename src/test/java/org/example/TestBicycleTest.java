package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class TestBicycleTest
{
    /**
     * Rigorous Test :-)
     */
    Bicycle bike = new Bicycle("Nexus");

    @Test
    public void encapsulationTest()
    {
        bike.setModel("Nexus");
        String result = bike.getModel();
        assertEquals("Nexus", result);
    }

    @Test
    public void inheritenceTest()
    {
        MountainBike mbike = new MountainBike(bike.getModel(), 3, 100, 25);
        String result = mbike.getModel();
        assertSame("Nexus", result);
    }

    @Test
    public void polymorphismTest()
    {

    }

}
