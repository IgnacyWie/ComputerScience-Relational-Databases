// Needed to expose the type to all classes in the package
class Driver {
    int driverId;
    String firstName;
    String secondName;
    char drivingLicence;
    Driver previous;
    Driver next;    

    Driver(int driverId, String firstName, String secondName, char drivingLicence) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.drivingLicence = drivingLicence;
    }
}

