 

class Bike:
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def __str__(self):
        return f"{self.name} - ${self.price:.2f}"

class BikeRental:
    def __init__(self):
        self.bikes = [
            Bike("Bike 1", 15.00),
            Bike("Bike 2", 20.00),
            Bike("Bike 3", 25.00),
            Bike("Bike 4", 30.00),
            Bike("Bike 5", 35.00),
        ]

    def pick_bikes(self, sequence):
        picked_bikes = []
        total_cost = 0

        for index in sequence:
            if index < len(self.bikes):
                picked_bike = self.bikes[index]
                picked_bikes.append(picked_bike)
                total_cost += picked_bike.price
            else:
                print(f"Invalid bike index: {index}")

        return picked_bikes, total_cost

def process_payment(total_cost):
    print(f"Total amount to pay: ${total_cost:.2f}")
    payment_successful = input("Proceed with payment? (yes/no): ").strip().lower() == 'yes'
    
    if payment_successful:
        print("Payment successful! Enjoy your ride!")
    else:
        print("Payment canceled.")

def main():
    bike_rental = BikeRental()
    
    # Example sequence of bike indices to pick
    sequence = [0, 2, 4]  # Picking Bike 1, Bike 3, and Bike 5

    picked_bikes, total_cost = bike_rental.pick_bikes(sequence)

    print("Bikes picked in sequence:")
    for bike in picked_bikes:
        print(bike)

    if total_cost > 0:
        process_payment(total_cost)

if __name__ == "__main__":
    main()

 