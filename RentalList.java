public class RentalList {

    // Create a Head and Tail for the Rental List
    Rental rentalsListHead;
    Rental rentalsListTail;

    // Add a Rental to the List
    public void addRental(int rentalId, int driverId, String registrationNumber, String startDate, String endDate) {
        Rental newRental = new Rental(rentalId, driverId, registrationNumber, startDate, endDate);

        if (rentalsListHead == null) {
            rentalsListHead = newRental;
            rentalsListTail = newRental;
        } else {
            rentalsListTail.next = newRental;
            newRental.previous = rentalsListTail;
            rentalsListTail = newRental;
        }
    }

    // Print the Rental List
    public void printRentalsList(Rental rentalsListHead, DriverList driverList, CarList carList) {
        Rental currentRental = rentalsListHead;

        // Display it with drivers name and cars model and number of seats
        System.out.println("****************************************************************");
        System.out.println("List of rentals: ");
        while (currentRental != null) {
            Driver driver = driverList.searchDriver(currentRental.driverId);
            Car car = carList.searchCar(currentRental.registrationNumber);
            System.out.println("Rental ID: " + currentRental.rentalId + " | Driver: " + driver.firstName + " " + driver.secondName + " | Car: " + car.model + " " + car.numberOfSeats + " | Start Date: " + currentRental.startDate + " | End Date: " + currentRental.endDate);
            currentRental = currentRental.next;
        }
    }
}
