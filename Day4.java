
import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected double price;

    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public abstract void displayDetails();
}

class Car extends Vehicle {
    private int numDoors;
    private String fuelType;

    public Car(String make, String model, int year, double price, int numDoors, String fuelType) {
        super(make, model, year, price);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println();
    }

    public double calculateMileage() {
        // Calculation logic for mileage
        return 0.0;
    }
}

class Motorcycle extends Vehicle {
    private boolean HasSidecar;
    private int EngineCapacity;

    public Motorcycle(String make, String model, int year, double price, boolean hasSidecar, int engineCapacity) {
        super(make, model, year, price);
        this.HasSidecar = hasSidecar;
        this.EngineCapacity = engineCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Motorcycle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("Has Sidecar: " + (HasSidecar ? "Yes" : "No"));
        System.out.println("Engine Capacity: " + EngineCapacity+ "cc");
        System.out.println();
    }

    public double calculateSpeed() {
        // Calculation logic for top speed
        return 0.0;
    }
}

public class Day4 {
    public static void main(String[] args) {
        List<Vehicle> inventory = new ArrayList<>();

        // Add vehicles to the inventory
        inventory.add(new Car("Toyota", "Corolla", 2020, 25000.0, 4, "Petrol"));
        inventory.add(new Motorcycle("Honda", "CBR500R", 2021, 9000.0, false, 500));

        // Display details of all vehicles in the inventory
        for (Vehicle vehicle : inventory) {
            vehicle.displayDetails();
        }
    }
}

