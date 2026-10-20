
class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Car starts with a key or push button.");
    }
}

class Bike extends Vehicle {
    public Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Bike starts using a self-start or kick.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Fortuner");
        Vehicle bike = new Bike("Honda", "Shine");

        System.out.println("----- Car Details -----");
        car.displayInfo();
        car.start();

        System.out.println("\n----- Bike Details -----");
        bike.displayInfo();
        bike.start();
    }
}
