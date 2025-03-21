package u9t2.cars;

public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }


    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider;
        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() / 2);
            setDiscountApplied(true);
        }
    }


    public boolean chargeAndDropOffRiders(double farePerRider) {
        int passengers = getPassengers() - 1;
        fareCollected += passengers * farePerRider;
        return dropOffPassengers(passengers);
    }

    
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fare Collected: " + fareCollected);
    }

    @Override
    public void dayEndSummary() {
        super.dayEndSummary();
        System.out.println("Total Fare Collected: " + fareCollected);
        fareCollected = 0;
    }
}