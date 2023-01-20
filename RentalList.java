public class RentalList {
    // Create a Rental Datatype
    class Rental {
        int rentalId;
        int driverId;
        String registrationNumber;
        String startDate;
        String endDate;
        Rental previous;
        Rental next;

        Rental(int rentalId, int driverId, String registrationNumber, String startDate, String endDate) {
            this.rentalId = rentalId;
            this.driverId = driverId;
            this.registrationNumber = registrationNumber;
            this.startDate = startDate;
            this.endDate = endDate;
        }
    }

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
    public void printRentalsList(Rental rentalsListHead, DriverList driverList) {
        Rental currentRental = rentalsListHead;

        System.out.println("****************************************************************");
        System.out.println("List of rentals: ");
        System.out.print("Rental ID" + "\t" + "Driver First Name" + "\t" + "Registration Number" + "\t" + "Start Date" + "\t" + "End Date" + "\n");
        while (currentRental != null) {
            System.out.println(currentRental.rentalId + "\t\t" + driverList.searchDriver(currentRental.driverId).firstName + "\t\t" + currentRental.registrationNumber + "\t\t" + currentRental.startDate + "\t\t" + currentRental.endDate);
            currentRental = currentRental.next;
        }
        System.out.println("****************************************************************");
    }
}
