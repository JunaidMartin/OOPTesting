package org.example;

public class Bicycle implements Model {
    // the Bicycle class has two fields
    public String model;

    // the Bicycle class has one constructor

    public Bicycle(String model)
    {
        this.model = model;
    }

    // the Bicycle class has three methods

    public String getModel()
    {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }



    // toString() method to print info of Bicycle
    public String toString()
    {
        return("The model is "+model);
    }

    @Override
    public void model()
    {
        System.out.print("Model is: Nexus");
    }
}
