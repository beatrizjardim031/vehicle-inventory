package com.pluralsight;

import java.util.Scanner;

public class VehicleInventoryApp {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//      object instantiation
//      class variable = create new object (calls the constructor with the data)
        Vehicle v1 = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        Vehicle v2 = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        Vehicle v3 = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        Vehicle v4 = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        Vehicle v5 = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        Vehicle v6 = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);

//       one variable for 20 vehicle objects
        Vehicle[] inventory = new Vehicle[20];
//       each spot holds a vehicle
        inventory[0] = v1;
        inventory[1] = v2;
        inventory[2] = v3;
        inventory[3] = v4;
        inventory[4] = v5;
        inventory[5] = v6;
        int vehicleCounter = 6;

        boolean isMenuRunning = true;

//      the loop keeps the app running until the user quits
        while (isMenuRunning) {
            System.out.printf("""
                    What do you want to do?
                    1 - List all vehicles
                    2 - Search by make/model\s
                    3 - Search by price range\s
                    4 - Search by color\s
                    5 - Add a vehicle\s
                    6 - Quit\s
                    Enter your command:  %n""");

            int menuCommand = input.nextInt();
            input.nextLine();


            switch (menuCommand) {
                case 1 -> listAllVehicles(inventory, vehicleCounter);
                case 2 -> {
                    System.out.println("What model are you looking for?");
                    String makeModel = input.nextLine();
                    findByMakeModel(inventory,vehicleCounter, makeModel);
                }
                case 3 -> {
                    System.out.printf("%nWhat is your price range? Enter minimum price: ");
                    double priceRangeMin = input.nextDouble();
                    System.out.printf("%nNow enter maximum price: ");
                    double priceRangeMax = input.nextDouble();
                    findByPriceRange(inventory, vehicleCounter, priceRangeMin, priceRangeMax);
                    input.nextLine();
                }
                case 4 -> {
                    System.out.println("What color do you prefer?");
                    String color = input.nextLine();
                    searchByColor(inventory, vehicleCounter, color);
                }
                case 5 -> System.out.println("Coming soon 👀");
                case 6 -> isMenuRunning = false;
                default -> System.out.println("Invalid command. Please try again.");
            }

        }



    }


//  METHODS: each method loops through the inventory check each vehicle and "prints" if it matches
    public static void listAllVehicles(Vehicle[] inventory, int vehicleCounter) {
        for (int i = 0; i < vehicleCounter; i++ ) {
            System.out.println(" |" + inventory[i].getVehicleId() + " | " + inventory[i].getMakeModel() + " | " + inventory[i].getColor() + " | " + inventory[i].getOdometerReader() +" | " + inventory[i].getPrice());
        }

    }

    public static void findByMakeModel(Vehicle[] inventory, int vehicleCounter, String makeModel) {
        for (int i = 0; i < vehicleCounter; i++) {
            if (inventory[i].getMakeModel().equals(makeModel)) {
                System.out.println(" |" + inventory[i].getVehicleId() + " | " + inventory[i].getMakeModel() + " | " + inventory[i].getColor() + " | " + inventory[i].getOdometerReader() + " | " + inventory[i].getPrice());
            }
        }

    }

    public static void findByPriceRange(Vehicle[] inventory, int vehicleCounter, double minPrice, double maxPrice) {
        for (int i = 0; i < vehicleCounter; i++) {
            if (inventory[i].getPrice() >= minPrice && inventory[i].getPrice() <= maxPrice ) {
                System.out.println(" |" + inventory[i].getVehicleId() + " | " + inventory[i].getMakeModel() + " | " + inventory[i].getColor() + " | " + inventory[i].getOdometerReader() + " | " + inventory[i].getPrice());
            }
        }

    }
    public static void searchByColor(Vehicle[] inventory, int vehicleCounter, String color) {
        for (int i = 0; i < vehicleCounter; i++) {
            if (inventory[i].getColor().equals(color)) {
                System.out.println(" |" + inventory[i].getVehicleId() + " | " + inventory[i].getMakeModel() + " | " + inventory[i].getColor() + " | " + inventory[i].getOdometerReader() + " | " + inventory[i].getPrice());
            }
        }

    }











}