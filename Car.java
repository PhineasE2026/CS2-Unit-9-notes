/*
 * Car is a SUBCLASS (child) of Vehicle class, it inherits from Vehicle
 * "Car IS-A type of Vehicle"
 */
public class Car extends Vehicle {
    // instantiated vorbles
    private int numSeats;
    private String brand;

    // constractions
    public Car() {
        super(); // CALL TO THE SUPERCLASS CONSTRUCTOR....
        this.numSeats = 5;
        this.brand = "Toyota Corolla";
    }

    public Car(int numWheels, double avgSpeed, String color, int numSeats, String brand) {
        super(numWheels, avgSpeed, color);
        this.numSeats = numSeats;
        this.brand = brand;
    }

    // Methodology.
    
}