package u9t3.cars;

public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    private int milesDriven;
    
    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
        milesDriven = 0; 
    }
  
    public String getLicensePlate() {
        return licensePlate;
    }
  
    public double getTollFee() {
        return tollFee;
    }
  
    public int getPassengers() {
        return passengers;
    }

    public void setTollFee(double tollFee) {
        this.tollFee = tollFee;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
  
    public double calculateTollPrice() {
        return tollFee * passengers;
    }


    public void printInfo() {
        System.out.println("License Plate Number: " + licensePlate);
        System.out.println("Toll Fee: " + tollFee);
        System.out.println("Passengers: " + passengers);
    }


    public void drive(int miles) {
        milesDriven += miles;
    }

    public void dayEndSummary() {
        System.out.println("Day End");
        System.out.println("Miles Driven: " + milesDriven + "mi");
        milesDriven = 0;
    }
}