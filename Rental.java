// Needed to expose the type to all classes in the package
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
