
class Bike:
    def __init__(self, name):
        self.name = name

    def __str__(self):
        return self.name

bikes = [
    Bike("Bike 1"),
    Bike("Bike 2"),
    Bike("Bike 3"),
    Bike("Bike 4"),
    Bike("Bike 5"),
]

def pick_bikes(bikes, sequence):
    picked_bikes = []
    for index in sequence:
        picked_bikes.append(bikes[index])
    return picked_bikes

# Example sequence
sequence = [2, 0, 4, 1, 3]

picked_bikes = pick_bikes(bikes, sequence)

print("Bikes picked in sequence:")
for bike in picked_bikes:
    print(bike)

    # for calculate the money price in each bike
      
      