package u9t1.lab1;

public class Subway extends Vehicle {
    private int cars;
    private String line;
    private String lastStop;

    public Subway(String name, int wheels, int cars, String line, String lastStop) {
        super(name, wheels);
        this.cars = cars;
        this.line = line;
        this.lastStop = lastStop;
    }

    public int getCars() {
        return cars;
    }
    public String getLine() {
        return line;
    }
    public String getLastStop() {
        return lastStop;
    }

    public void announce() {
        System.out.println("This is a " + lastStop + "-bound " + line + " train.");
    }
}