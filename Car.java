// Needed to expose the type to all classes in the package
class Car {
    String model;
    String registrationNumber;
    int numberOfSeats;
    String VIN;
    Car previous;
    Car next;

    Car(String model, String registrationNumber, int numberOfSeats, String VIN) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.VIN = VIN;
    }
}

