// import scanner class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DriverList driverList1 = new DriverList();

        driverList1.addDriver(1, "Eliza", "Smith", 'E');
        driverList1.addDriver(2, "David", "Mullen", 'D');
        driverList1.addDriver(3, "Mark", "Johnson", 'D');
        driverList1.printDriversList(driverList1.driverListHead);

        CarList carList1 = new CarList();
        carList1.addCar("WZ 3456",  "Corolla", 5, "ABC12345");
        carList1.addCar("WN 5678",  "Polo", 4, "XYZ45789");
        carList1.addCar("SLU 3634",  "Sprinter", 7, "SD34 67");

        carList1.printCarList(carList1.carsListHead);

        RentalList rentalList1 = new RentalList();
        rentalList1.addRental(1, 1, "WZ 3456", "01/01/2020", "01/02/2020");
        rentalList1.addRental(2, 2, "WN 5678", "01/01/2020", "01/02/2020");
        rentalList1.addRental(3, 3, "SLU 3634", "01/01/2020", "01/02/2020");
        rentalList1.printRentalsList(rentalList1.rentalsListHead, driverList1, carList1);

        // TODO: Create menu for adding, printing, removing drivers, cars, rentals in while loop
        //menu();
    }

    public static void menu(){
        // Create new scanner entity
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Print menu
        printMenu();
        while(running) {
            System.out.println("Please enter your selection: ");
            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("Add a driver");
                    break;
                case 2:
                    System.out.println("Add a car");
                    break;
                case 3:
                    System.out.println("Add a rental");
                    break;
                case 4:
                    System.out.println("Print drivers list");
                    break;
                case 5:
                    System.out.println("Print cars list");
                    break;
                case 6:
                    System.out.println("Print rentals list");
                    break;
                case 7:
                    System.out.println("Remove a driver");
                    break;
                case 8:
                    System.out.println("Remove a car");
                    break;
                case 9:
                    System.out.println("Remove a rental");
                    break;
                case 10:
                    System.out.println("Exit");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }

        // Close the scanner
        scanner.close();
    }

    public static void printMenu() {
        System.out.println("****************************************************************");
        System.out.println("Welcome to the Car Rental System");
        System.out.println("****************************************************************");
        System.out.println("Please select an option from the menu below:");
        System.out.println("1. Add a driver");
        System.out.println("2. Add a car");
        System.out.println("3. Add a rental");
        System.out.println("4. Print drivers list");
        System.out.println("5. Print cars list");
        System.out.println("6. Print rentals list");
        System.out.println("7. Remove a driver");
        System.out.println("8. Remove a car");
        System.out.println("9. Remove a rental");
        System.out.println("10. Exit");
        System.out.println("****************************************************************");
    }
}