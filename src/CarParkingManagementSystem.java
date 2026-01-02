import java.util.Scanner;

public class CarParkingManagementSystem {

    // -------------------- ABSTRACT CLASS --------------------


    // -------------------- CAR CLASS --------------------


    // -------------------- PARKING LOT CLASS --------------------


    // -------------------- MAIN CLASS --------------------

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParkingLot parking = new ParkingLot(2); //Creates parking lot with 2 slots.

        int choice;

        do { //Loop keeps program running until exit.
            System.out.println("\n--- CAR PARKING MANAGEMENT SYSTEM ---");
            System.out.println("1. Car Entry");
            System.out.println("2. Car Exit");
            System.out.println("3. View Parked Cars");
            System.out.println("4. Search Car (Binary Search)");
            System.out.println("5. Sort Cars (Bubble Sort)");
            System.out.println("6. Check Parking Availability");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Car Number (e.g. ABC-123): ");
                    String number = sc.nextLine();

                    System.out.print("Enter Car Brand: ");
                    String brand = sc.nextLine();

                    System.out.print("Enter Owner Name: ");
                    String owner = sc.nextLine();

                    Car car = new Car(number, brand, owner);
                    parking.addCar(car);
                    break;

                case 2:
                    System.out.print("Enter Car Number to Exit: ");
                    String exitNumber = sc.nextLine();
                    parking.removeCar(exitNumber);
                    break;

                case 3:
                    parking.displayCars();
                    break;

                case 4:
                    System.out.print("Enter Car Number to Search: ");
                    String searchNumber = sc.nextLine();
                    parking.binarySearch(searchNumber);
                    break;

                case 5:
                    parking.bubbleSort();
                    parking.displayCars();
                    break;

                case 6:
                    parking.showStatus();
                    break;

                case 7:
                    System.out.println("System Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);

        sc.close();

    }
}
