package u9t2.cars;

public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
        return axles;
    }
  
    public boolean hasTrailer() {
        return hasTrailer;
    }


    public boolean validateLicensePlate() {
        if (hasTrailer) {
            if (axles > 4) {
                return getLicensePlate().endsWith("MX");
            } else {
                return getLicensePlate().endsWith("LX");
            }
        } else {
            return true;
        }
    }


    @Override
    public double calculateTollPrice() {
        double result =  getTollFee() * axles;
        if (hasTrailer) result *= 2;
        return result;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Axles: " + axles);
        System.out.println("Has Trailer: " + hasTrailer);
    }
}