package u9t1.lab1;

public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle myBike = new Bicycle("Bicycle", 2, 4);
        System.out.println(myBike.getName());
        System.out.println(myBike.getWheels());
        System.out.println(myBike.getGearCount());
        myBike.move(20);
        myBike.turn();
        myBike.ringBell();
        myBike.brake();


        Subway gTrain = new Subway("G Train", 10, 4, "G", "Church Ave");
        System.out.println(gTrain.getName());
        System.out.println(gTrain.getWheels());
        System.out.println(gTrain.getCars());
        System.out.println(gTrain.getLine());
        System.out.println(gTrain.getLastStop());
        gTrain.move(50);
        gTrain.turn();
        gTrain.brake();
        gTrain.announce();
    }
}