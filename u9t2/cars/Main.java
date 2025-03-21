package u9t2.cars;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("NULL", 4, 5);
        Car car = new Car("NULL1", 4, 5, true);
        Truck truck = new Truck("NULL2", 4, 5, 4, true);
        Taxi taxi = new Taxi("NULL3", 4, 5, true, 10);

        vehicle.drive(5);
        car.drive(10);
        truck.drive(15);
        taxi.drive(20);

        System.out.println("Vehicle:");
        vehicle.dayEndSummary();
        System.out.println("\nCar:");
        car.dayEndSummary();
        System.out.println("\nTruck:");
        truck.dayEndSummary();
        System.out.println("\nTaxi:");
        taxi.dayEndSummary();
    }
}
