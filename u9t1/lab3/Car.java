package u9t1.lab3;

public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
        return electric;
    }
  
    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public void setDiscountApplied(boolean discountApplied) {
        this.discountApplied = discountApplied;
    }


    public void printCar() {
        System.out.println("License Plate Number: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Is Electric: " + electric);
        System.out.println("Discount Applied: " + discountApplied);
    }


    public boolean dropOffPassengers(int numOut) {
        if (numOut < getPassengers()) {
            setPassengers(getPassengers() - numOut);
            return true;
        } else {
            return false;
        }
    }

    public void applyDiscount() {
        if (!discountApplied && electric) {
            discountApplied = true;
            setTollFee(getTollFee() / 2);
        }
    }
}