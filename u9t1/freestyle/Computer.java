package u9t1.freestyle;

public class Computer extends Device {
    private String gpuName;

    public Computer(String name, String architecture, int storage, String gpuName) {
        super(gpuName, architecture, storage);
        this.gpuName = gpuName;
    }

    public String getGpuName() {
        return gpuName;
    }

    public void powerOn() {
        System.out.println("Powered on the computer");
    }
}