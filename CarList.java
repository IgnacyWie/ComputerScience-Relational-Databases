class CarList{
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
    Car carsListHead = null;
    Car carsListTail = null;

    // search by id and return the car
    public Car searchCar(String registrationNumber){
        Car car1 = carsListHead;
        while (car1 != null){
            if (car1.registrationNumber.equals(registrationNumber)){
                return car1;
            }
            car1 = car1.next;
        }
        return null;
    }

    public void removeCar(String registrationNumber){
        Car car1 = carsListHead;
        while (car1 != null){
            if (car1.registrationNumber.equals(registrationNumber)){
                if (car1.previous == null){
                    carsListHead = car1.next;
                    carsListHead.previous = null;
                }
                else if (car1.next == null){
                    carsListTail = car1.previous;
                    carsListTail.next = null;
                }
                else {
                    car1.previous.next = car1.next;
                    car1.next.previous = car1.previous;
                }
            }
            car1 = car1.next;
        }
    }
    
    public void addCar(String model, String registrationNumber, int numberOfSeats, String VIN){
        Car newCar = new Car(model, registrationNumber, numberOfSeats, VIN);
        
        if(carsListHead == null){
            carsListHead = newCar;
            carsListTail = newCar;
            newCar.previous = null;
            newCar.next = null;
        }
        else {
            carsListTail.next = newCar;
            newCar.previous = carsListTail;
            newCar.next = null;
            carsListTail = newCar;
        }
    }
    

    
    public void printCarList(Car head){
        Car car1 = head;

        System.out.println("****************************************************************");
        System.out.println("List of cars: ");
        System.out.print("Model" + "\t" + "Registration Number" + "\t\t" + "Number of seats" + "\t\t" + "VIN" + "\n");
        while (car1 != null){
            System.out.print(car1.model + "\t" + car1.registrationNumber + "\t\t\t" + car1.numberOfSeats + "\t\t\t" + car1.VIN + "\n");
            car1 = car1.next;
        }
        System.out.println("****************************************************************");

    }
}