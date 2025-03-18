package u9t1.lab1;

public class Bicycle extends Vehicle {
    private int gearCount;

    public Bicycle(String name, int wheels, int gearCount) {
        super(name, wheels);
        this.gearCount = gearCount;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void ringBell() {
        System.out.println("(Ring sound)");
    }
}