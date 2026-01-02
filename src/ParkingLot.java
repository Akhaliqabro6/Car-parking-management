import java.util.ArrayList;

class ParkingLot {
    private ArrayList<Car> cars;
    private int capacity;

    ParkingLot(int capacity) {
        this.capacity = capacity;
        cars = new ArrayList<>();
    }

    public boolean isAvailable() {
        return cars.size() < capacity;
    }

    //testing

    public void addCar(Car car) {
        if (isAvailable()) {
            cars.add(car);
            System.out.println("Car Parked Successfully.");
        } else {
            System.out.println("Parking Full! No slot available.");
        }
    }

    public void removeCar(String carNumber) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getCarNumber().equals(carNumber)) {
                cars.remove(i);
                System.out.println("Car Removed Successfully.");
                return;
            }
        }
        System.out.println("Car Not Found.");
    }

    public void displayCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars parked.");
            return;
        }
        for (Car c : cars) {
            c.display();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = 0; j < cars.size() - i - 1; j++) {
                if (cars.get(j).getCarNumber()
                        .compareTo(cars.get(j + 1).getCarNumber()) > 0) {

                    Car temp = cars.get(j);
                    cars.set(j, cars.get(j + 1));
                    cars.set(j + 1, temp);
                }
            }
        }
        System.out.println("Cars sorted by Car Number.");
    }

    // Binary Search
    public void binarySearch(String key) {
        if (cars.isEmpty()) {
            System.out.println("No cars to search.");
            return;
        }

        bubbleSort();

        int low = 0;
        int high = cars.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midCar = cars.get(mid).getCarNumber();

            if (midCar.equals(key)) {
                System.out.println("Car Found:");
                cars.get(mid).display();
                return;
            } else if (midCar.compareTo(key) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Car Not Found.");
    }

    public void showStatus() {
        System.out.println("Total Slots: " + capacity);
        System.out.println("Occupied Slots: " + cars.size());
        System.out.println("Available Slots: " + (capacity - cars.size()));
    }
}

