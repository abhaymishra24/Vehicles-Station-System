
// To create a lock and unlock access system for bikes, we can use a class to represent each bike.
// The class will have methods to lock and unlock the bike, as well as a way to check its current status (locked or unlocked). 

import java.util.Scanner;

class Bike {
    private String bikeId;
    private boolean isLocked;

    public Bike(String bikeId) {
        this.bikeId = bikeId;
        this.isLocked = true; // Bikes are locked by default
    }

    public void lock() {
        isLocked = true;
        System.out.println("Bike " + bikeId + " is now locked.");
    }

    public void unlock() {
        isLocked = false;
        System.out.println("Bike " + bikeId + " is now unlocked.");
    }

    public boolean isLocked() {
        return isLocked;
    }

    public String getBikeId() {
        return bikeId;
    }
}

public class Bikelock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bike[] bikes = new Bike[5];

        // Initialize bikes
        for (int i = 0; i < bikes.length; i++) {
            bikes[i] = new Bike("Bike-" + (i + 1));
        }

        while (true) {
            System.out.println("\n--- Bike Lock System ---");
            System.out.println("1. Lock a bike");
            System.out.println("2. Unlock a bike");
            System.out.println("3. Check bike status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter bike ID to lock (e.g., Bike-1): ");
                    String lockId = scanner.next();
                    lockBike(bikes, lockId);
                    break;
                case 2:
                    System.out.print("Enter bike ID to unlock (e.g., Bike-1): ");
                    String unlockId = scanner.next();
                    unlockBike(bikes, unlockId);
                    break;
                case 3:
                    System.out.print("Enter bike ID to check status (e.g., Bike-1): ");
                    String checkId = scanner.next();
                    checkBikeStatus(bikes, checkId);
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void lockBike(Bike[] bikes, String bikeId) {
        for (Bike bike : bikes) {
            if (bike.getBikeId().equalsIgnoreCase(bikeId)) {
                bike.lock();
                return;
            }
        }
        System.out.println("Bike ID not found.");
    }

    private static void unlockBike(Bike[] bikes, String bikeId) {
        for (Bike bike : bikes) {
            if (bike.getBikeId().equalsIgnoreCase(bikeId)) {
                bike.unlock();
                return;
            }
        }
        System.out.println("Bike ID not found.");
    }

    private static void checkBikeStatus(Bike[] bikes, String bikeId) {
        for (Bike bike : bikes) {
            if (bike.getBikeId().equalsIgnoreCase(bikeId)) {
                String status = bike.isLocked() ? "locked" : "unlocked";
                System.out.println("Bike " + bikeId + " is currently " + status + ".");
                return;
            }
        }
        System.out.println("Bike ID not found.");
    }
}