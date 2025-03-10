/*
 * Vehicle is a superclass (parent)
 * Most general attributes and behaviors in this class.
 * java classes can have multiple children :) but only one parent!
 */
public class Vehicle {
    //1. instonce varbles
    private int numWheels;
    private double avgSpeed;
    private String color;
    
    // 2. contractors
    public Vehicle() {
        this.numWheels = 4;
        this.avgSpeed = 60;
        this.color = "White";
    }

    public Vehicle(int numWheels, double avgSpeed, String color) {
        // Instantiate to established debates
        this.numWheels = numWheels;
        this.avgSpeed = avgSpeed;
        this.color = color;
    }

    // 3. functions

    // toString method gets called when you pass object in print statement automatically
    public String toString() {
        return ("Vehicle[numWheels: " + this.numWheels + ", avgSpeed: " + this.avgSpeed + ", color: " + this.color + "]");
    }

    public int getNumWheels() {
        return numWheels;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public String getColor() {
        return color;
    }

    public void makeNoise() {
        System.out.println("vroom vrooom");
    }
}