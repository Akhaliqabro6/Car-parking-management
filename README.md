🚗 Car Parking Management System (Java)

A simple and well-structured Car Parking Management System built using Core Java.
This project demonstrates OOP concepts such as Abstraction, Inheritance, Encapsulation, along with ArrayList, Bubble Sort, and Binary Search.

📌 Features
✔ Add Car (Car Entry)

Enter Car Number

Enter Car Brand

Enter Owner Name

Car gets added to the parking lot

✔ Remove Car (Car Exit)

Remove a car using its unique number

✔ View All Parked Cars

Displays all currently parked cars with details

✔ Search Car (Binary Search)

Search for a car using binary search

Sorting happens automatically before the search

✔ Sort Cars (Bubble Sort)

Sorts parked cars by Car Number in ascending order

✔ Check Parking Availability

Shows total slots

Occupied slots

Remaining available slots
| Concept                 | Description                                        |
| ----------------------- | -------------------------------------------------- |
| **Abstract Class**      | Vehicle is an abstract class for common attributes |
| **Inheritance**         | Car class extends Vehicle                          |
| **ArrayList**           | Stores car objects dynamically                     |
| **Bubble Sort**         | Sorting cars by car number                         |
| **Binary Search**       | Searching cars efficiently                         |
| **Encapsulation**       | Organized class structure                          |
| **Loops & Switch Case** | Menu-driven interface                              |


src/
│
├── CarParkingManagementSystem.java   // Main menu + Scanner input
├── ParkingLot.java                   // Parking logic
├── Car.java                          // Car child class
└── Vehicle.java                      // Abstract class
