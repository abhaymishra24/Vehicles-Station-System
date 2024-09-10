


class BikeMeter:
    def __init__(self):
        self.distance_traveled = 0  # in kilometers
        self.base_fare = 4.0         # base fare in currency units
        self.per_km_rate = 2.5       # fare per kilometer in currency units

    def add_distance(self, kilometers):
        """Add distance traveled to the meter."""
        if kilometers < 0:
            print("Distance cannot be negative.")
            return
        self.distance_traveled += kilometers
        print(f"Distance added: {kilometers} km. Total distance: {self.distance_traveled} km.")

    def calculate_fare(self):
        """Calculate the total fare based on distance traveled."""
        total_fare = self.base_fare + (self.distance_traveled * self.per_km_rate)
        return total_fare

    def reset_meter(self):
        """Reset the bike meter."""
        self.distance_traveled = 0
        print("Bike meter has been reset.")

def main():
    bike_meter = BikeMeter()
    
    while True:
        print("\nMenu:")
        print("1. Add Distance")
        print("2. Calculate Fare")
        print("3. Reset Meter")
        print("4. Exit")
        
        choice = input("Enter your choice: ")

        if choice == '1':
            kilometers = float(input("Enter distance in kilometers: "))
            bike_meter.add_distance(kilometers)
        elif choice == '2':
            fare = bike_meter.calculate_fare()
            print(f"Total fare for {bike_meter.distance_traveled} km is: {fare:.2f} currency units.")
        elif choice == '3':
            bike_meter.reset_meter()
        elif choice == '4':
            print("Exiting the program.")
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()