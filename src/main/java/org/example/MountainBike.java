package org.example;



public class MountainBike extends Bicycle {
    // the MountainBike subclass adds one more field
    public int seatHeight;
    public int gear;
    public int speed;

    // the MountainBike subclass has one constructor
    public MountainBike(String model, int gear,int speed,
                        int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(model);
        gear = gear;
        speed = speed;
        seatHeight = startHeight;
    }
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    public int getGear()
    {
        return gear;
    }
    public int getSpeed()
    {
        return speed;
    }
    // the MountainBike subclass adds one more method
    public void setGear(int gear)
    {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info

    @Override
    public String toString()
    {
        return (super.toString()+"No of gears are "+gear
            +"\n"
            + "speed of bicycle is "+speed +
                "\nseat height is "+seatHeight);
    }
    @Override
    public void model()
    {
        System.out.print("Model is: Nexus");
    }

}
