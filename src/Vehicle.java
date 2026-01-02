abstract class Vehicle {
        protected String carNumber;
        protected String carBrand;
        protected String ownerName;

        public Vehicle(String carNumber, String carBrand, String ownerName) {
            this.carNumber = carNumber;
            this.carBrand = carBrand;
            this.ownerName = ownerName;
        }

        public String getCarNumber() {
            return carNumber;
        }

        public abstract void display();
    }


