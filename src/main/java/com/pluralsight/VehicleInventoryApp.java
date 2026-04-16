package com.pluralsight;

import java.util.Scanner;

public class VehicleInventoryApp {
    static Scanner input =  new Scanner(System.in);
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(101121,"Ford Explorer", "Red", 45000, 13500);
        Vehicle v2 = new Vehicle(101122,"Toyota Camry", "Blue",60000,11000);
        Vehicle v3 = new Vehicle(101123,"Chevrolet Malibu", "Black",50000,9700);
        Vehicle v4 = new Vehicle(101124,"Honda Civic", "White",70000,7500);
        Vehicle v5 = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        Vehicle v6 = new Vehicle(101126,"Jeep Wrangler", "Yellow",30000,16000);

        Vehicle [] inventory = new Vehicle[20];
        inventory [0] = v1;
        inventory [1] = v2;
        inventory [2] = v3;
        inventory [3] = v4;
        inventory [4] = v5;
        inventory [5] = v6;
        int vehicleCounter = 6;

        boolean isMenuRunning = true;

        while (isMenuRunning) {
            System.out.print("""
                    What do you want to do?
                    1 - List all vehicles
                    2 - Search by make/model\s
                    3 - Search by price range\s
                    4 - Search by color\s
                    5 - Add a vehicle\s
                    6 - Quit\s
                    Enter your command:  """);

            int menuCommand = input.nextInt();

            switch (menuCommand) {
                case 1:
                    listAllVehicles(inventory, vehicleCounter);
                    break;
            }





        }




    }

        public static void listAllVehicles(Vehicle[] inventory, int vehicleCounter) {
            for (int i = 0; i < vehicleCounter; i++ ) {
                System.out.println("|" + inventory[i].getVehicleId() + " | " + inventory[i].getMakeModel() + " | " + inventory[i].getColor() + " | " + inventory[i].getOdometerReader() +" | " + inventory[i].getPrice());


            }


        }
}