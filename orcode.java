 

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
 