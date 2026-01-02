class Car extends Vehicle {

    public Car(String carNumber, String carBrand, String ownerName) {
        super(carNumber, carBrand, ownerName);
    }

    @Override
    public void display() {
        System.out.println(
                "Car No: " + carNumber +
                        " | Brand: " + carBrand +
                        " | Owner: " + ownerName );
    }
}

