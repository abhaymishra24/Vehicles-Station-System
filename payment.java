
// To create a Java program that recognizes bikes and cars for individual payment processing,
// you can follow an object-oriented approach. Below is a simple implementation that defines classes for Vehicle,
// Bike, and Car, and calculates payment based on vehicle type.

import java.util.Scanner;

// Base class for Vehicle
abstract class Vehicle {
    protected String licensePlate;
    protected double rentalRate;

    public Vehicle(String licensePlate, double rentalRate) {
        this.licensePlate = licensePlate;
        this.rentalRate = rentalRate;
    }

    public abstract double calculatePayment(int hours);
}

// Class for Bike
class Bike extends Vehicle {
    public Bike(String licensePlate) {
        super(licensePlate, 5.0); // Rental rate for bike
    }

    @Override
    public double calculatePayment(int hours) {
        return hours * rentalRate;
    }
}

// Class for Car
class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate, 15.0); // Rental rate for car
    }

    @Override
    public double calculatePayment(int hours) {
        return hours * rentalRate;
    }
}

// Main class
public class  payment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle type (bike/car): ");
        String vehicleType = scanner.nextLine().toLowerCase();

        System.out.println("Enter license plate: ");
        String licensePlate = scanner.nextLine();

        System.out.println("Enter rental duration in hours: ");
        int hours = scanner.nextInt();

        Vehicle vehicle;

        // Create vehicle object based on input type
        if (vehicleType.equals("bike")) {
            vehicle = new Bike(licensePlate);
        } else if (vehicleType.equals("car")) {
            vehicle = new Car(licensePlate);
        } else {
            System.out.println("Invalid vehicle type.");
            scanner.close();
            return;
        }

        // Calculate payment
        double payment = vehicle.calculatePayment(hours);
        System.out.printf("The total payment for the %s with license plate %s for %d hours is: $%.2f\n",
                vehicleType, licensePlate, hours, payment);

        scanner.close();
    }
}