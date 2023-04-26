public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Car("Car1", 4), new Car("Car2", 4)};


        Truck[] trucks = {new Truck("truck1", 6), new Truck("truck2", 8)};

        Bicycle[] bicycles = {new Bicycle("bicycle1", 2), new Bicycle("bicycle2", 2)};
        TransportVehicle[] transportVehicles = new TransportVehicle[cars.length + trucks.length + bicycles.length];

        for (int i = 0; i < cars.length; i++) {
            transportVehicles[i] = cars[i];

        }
        for (int i = 0; i < trucks.length; i++) {
            transportVehicles[i + cars.length] = trucks[i];

        }
        for (int i = 0; i < bicycles.length; i++) {
            transportVehicles[i + cars.length + trucks.length] = bicycles[i];

        }


        for (int i = 0; i < transportVehicles.length; i++) {
            transportVehicles[i].service();
        }


    }
}