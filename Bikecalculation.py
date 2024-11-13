
# This is the code for calculating the number of bikes that are standing at Vhaicles station

# here's a Python code snippet that calculates the number and type of bikes available at each statio


class Bike:
    def __init__(self, model, type):
        self.model = model
        self.type = type

class Station:
    def __init__(self, name):
        self.name = name
        self.bikes = []

    def add_bike(self, bike):
        self.bikes.append(bike)

    def count_bikes(self):
        return len(self.bikes)

    def count_bike_types(self):
        bike_types = {}
        for bike in self.bikes:
            if bike.type in bike_types:
                bike_types[bike.type] += 1
            else:
                bike_types[bike.type] = 1
        return bike_types

# Create stations
station1 = Station("Vhaicales")
station2 = Station("Station B")
station3 = Station("Station C")

# Create bikes
bike1 = Bike("Model A", "Mountain")
bike2 = Bike("Model B", "Road")
bike3 = Bike("Model C", "City")
bike4 = Bike("Model D", "Mountain")
bike5 = Bike("Model E", "Road")
bike6 = Bike("Model F", "City")

# Add bikes to stations
station1.add_bike(bike1)
station1.add_bike(bike2)
station1.add_bike(bike3)
station2.add_bike(bike4)
station2.add_bike(bike5)
station3.add_bike(bike6)

# Print results
print(f"Station: {station1.name}")
print(f"Total bikes: {station1.count_bikes()}")
print(f"Bike types: {station1.count_bike_types()}")
print()

print(f"Station: {station2.name}")
print(f"Total bikes: {station2.count_bikes()}")
print(f"Bike types: {station2.count_bike_types()}")
print()

print(f"Station: {station3.name}")
print(f"Total bikes: {station3.count_bikes()}")
print(f"Bike types: {station3.count_bike_types()}")

