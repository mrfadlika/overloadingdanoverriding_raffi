class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving fast");
    }
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike is moving slowly");
    }
}

class Truck extends Vehicle {
    @Override
    void move() {
        System.out.println("Truck is moving with load");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle myTruck = new Truck();

        myVehicle.move();
        myCar.move();
        myBike.move();
        myTruck.move();
    }
}