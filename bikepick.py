

                
                  # <---Define a dictionary to store bike models and their prices--->


bike_prices = {
    "Mountain Bike": 500,
    "Road Bike": 700,
    "Hybrid Bike": 600,
    "Electric Bike": 1200,
    "BMX Bike": 300,
    "Sports Bike": 350,
    "Genral Bike": 200
}

def display_bike_prices():
    """Display the prices of all bike models."""

    print("Bike Prices:")
    for bike, price in bike_prices.items():

        print(f"{bike}: Rs:{price}")

def update_bike_price(bike_model, new_price):
    """Update the price of a specific bike model."""

    if bike_model in bike_prices:
        bike_prices[bike_model] = new_price
        print(f"Updated {bike_model} price to Rs:{new_price}.")
    else:
        print(f"{bike_model} not found in the bike list.")

def main():
    # Display the initial bike prices
    display_bike_prices()
    
    # Update a bike price as an example
    update_bike_price("Electric Bike", 650)
    
    # Display the updated bike prices
    display_bike_prices()

if __name__ == "__main__":
    main()
      
      