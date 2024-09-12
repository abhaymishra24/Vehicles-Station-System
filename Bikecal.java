
// Below is a Java program that calculates the number of vehicles at each station.
// This program uses classes to represent vehicles and stations,
// allowing you to add vehicles to different stations and calculate the total number of vehicles at each station.



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Vehicle {
    private String vehicleNumber;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}

class Station {
    private String name;
    private List<Vehicle> vehicles;

    public Station(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.printf("Vehicle %s added to station %s.%n", vehicle.getVehicleNumber(), name);
    }

    public int getVehicleCount() {
        return vehicles.size();
    }

    public Map<String, Integer> getVehicleTypesCount() {
        Map<String, Integer> vehicleTypeCount = new HashMap<>();
        for (Vehicle vehicle : vehicles) {
            vehicleTypeCount.put(vehicle.getVehicleType(), vehicleTypeCount.getOrDefault(vehicle.getVehicleType(), 0) + 1);
        }
        return vehicleTypeCount;
    }
}

public class Bikecal {
    public static void main(String[] args) {
        // Create stations
        Station station1 = new Station("Station A");
        Station station2 = new Station("Station B");

        // Create vehicles
        Vehicle vehicle1 = new Vehicle("KA-01-HH-1234", "Car");
        Vehicle vehicle2 = new Vehicle("KA-01-HH-5678", "Bike");
        Vehicle vehicle3 = new Vehicle("KA-02-HH-9101", "Car");
        Vehicle vehicle4 = new Vehicle("KA-02-HH-1121", "Truck");
        Vehicle vehicle5 = new Vehicle("KA-01-HH-3141", "Bike");

        // Add vehicles to stations
        station1.addVehicle(vehicle1);
        station1.addVehicle(vehicle2);
        station2.addVehicle(vehicle3);
        station2.addVehicle(vehicle4);
        station1.addVehicle(vehicle5);

        // Display vehicle counts
        System.out.printf("Total vehicles at %s: %d%n", station1.getName(), station1.getVehicleCount());
        System.out.printf("Total vehicles at %s: %d%n", station2.getName(), station2.getVehicleCount());

        // Display vehicle types count
        System.out.println("Vehicle types count at " + station1.getName() + ": " + station1.getVehicleTypesCount());
        System.out.println("Vehicle types count at " + station2.getName() + ": " + station2.getVehicleTypesCount());
    }
}