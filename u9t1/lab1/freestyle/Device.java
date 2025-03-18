package u9t1.lab1.freestyle;

public class Device {
    private String name;
    private String architecture;
    private int usedStorage;
    private int maxStorage;

    public Device(String name, String architecture, int storage) {
        this.name = name;
        this.architecture = architecture;
        this.maxStorage = storage;
    }

    public String getName() {
        return name;
    }
    public String getArchitecture() {
        return architecture;
    }
    public int getMaxStorage() {
        return maxStorage;
    }

    public void storeFile(int size) {
        if (usedStorage + size > maxStorage) {
            System.out.println("Error: Cannot fit file into storage");
            return;
        }
        usedStorage += size;
        System.out.println("Successfully stored file (" + usedStorage + "/" + maxStorage + " used)");
    }
}