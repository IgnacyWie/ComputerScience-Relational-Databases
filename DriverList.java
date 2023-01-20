class DriverList{
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

    Driver driverListHead = null;
    Driver driverListTail = null;

    // search by id and return driver
    public Driver searchDriver(int driverId){
        Driver drv1 = driverListHead;
        while (drv1 != null){
            if (drv1.driverId == driverId){
                return drv1;
            }
            drv1 = drv1.next;
        }
        return null;
    }

    // remove driver by id
    public void removeDriver(int driverId){
        Driver drv1 = driverListHead;
        while (drv1 != null){
            if (drv1.driverId == driverId){
                if (drv1.previous == null){
                    driverListHead = drv1.next;
                    driverListHead.previous = null;
                }
                else if (drv1.next == null){
                    driverListTail = drv1.previous;
                    driverListTail.next = null;
                }
                else {
                    drv1.previous.next = drv1.next;
                    drv1.next.previous = drv1.previous;
                }
            }
            drv1 = drv1.next;
        }
    }

    public void addDriver(int driverId, String firstName, String secondName, char drivingLicence){
        Driver newDriver = new Driver(driverId, firstName, secondName,  drivingLicence);

        if(driverListHead == null){
            driverListHead = newDriver;
            driverListTail = newDriver;
            newDriver.previous = null;
            newDriver.next = null;
        }
        else {
            driverListTail.next = newDriver;
            newDriver.previous = driverListTail;
            newDriver.next = null;
            driverListTail = newDriver;
        }
    }

    public void printDriversList(Driver head){
        // drv1 auxiliary variable
        Driver drv1 = head;

        System.out.println("****************************************************************");
        System.out.println("List of drivers: ");
        System.out.print("Id" + "\t" + "First name" + "\t\t" + "Second name" + "\t\t" + "Driving licence" + "\n");
        while (drv1 != null){
            System.out.print(drv1.driverId + "\t" + drv1.firstName + "\t\t\t" + drv1.secondName + "\t\t\t" + drv1.drivingLicence + "\n");
            drv1 = drv1.next;
        }
        System.out.println("****************************************************************");

    }

}