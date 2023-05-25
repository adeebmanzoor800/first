class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double rentalPrice;

    public Vehicle(String brand, String model, int year, double rentalPrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void displayVehicleInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Rental Price: $" + rentalPrice);
    }
}

class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String brand, String model, int year, double rentalPrice, int numberOfSeats) {
        super(brand, model, year, rentalPrice);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}

class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String brand, String model, int year, double rentalPrice, int engineCapacity) {
        super(brand, model, year, rentalPrice);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
}

public class Main {
    public static void main(String[] args) {
        Car Suzuki = new Car("alto", "Camry", 2022, 50.0, 5);
        Motorcycle tata = new Motorcycle("Honda", "CBR600RR", 2021, 70.0, 600);

        Suzuki.displayVehicleInfo();
        System.out.println("Number of Seats: " + Suzuki.getNumberOfSeats());

        System.out.println();

        tata.displayVehicleInfo();
        System.out.println("Engine Capacity: " + tata.getEngineCapacity());
    }
}

