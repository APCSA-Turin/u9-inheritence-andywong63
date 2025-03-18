package u9t1.lab2.computer;

public class Tablet extends Computer {
    private boolean stylusIncluded;

    public Tablet(int screenSize, int memory, boolean stylusIncluded) {
        super(screenSize, memory);
        this.stylusIncluded = stylusIncluded;
    }

    public boolean isStylusIncluded() {
        return stylusIncluded;
    }
}