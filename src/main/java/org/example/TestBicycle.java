package org.example;

/**
 * Hello world!
 *
 */
public class TestBicycle
{
    public static void main( String[] args )
    {
        //Bicycle bike = new Bicycle ()
        MountainBike mbike = new MountainBike("Nexus", 3, 100, 25);
        System.out.println(mbike.toString());
    }


}
