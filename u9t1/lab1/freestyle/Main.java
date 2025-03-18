package u9t1.lab1.freestyle;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Basic Device", "x86", 16);
        System.out.println(device.getName());
        System.out.println(device.getArchitecture());
        System.out.println(device.getMaxStorage());
        device.storeFile(8);
        device.storeFile(10);

        Computer computer = new Computer("Dell Latitude", "x86-64", 512, "RTX 4060");
        System.out.println(computer.getName());
        System.out.println(computer.getArchitecture());
        System.out.println(computer.getMaxStorage());
        System.out.println(computer.getGpuName());
        computer.powerOn();
        computer.storeFile(50);
        computer.storeFile(5);

        Phone phone = new Phone("iPhone 13", "arm64e", 128, "83808480918792");
        System.out.println(phone.getName());
        System.out.println(phone.getArchitecture());
        System.out.println(phone.getMaxStorage());
        System.out.println(phone.getImeiNum());
        phone.storeFile(64);
        phone.storeFile(96);
        Phone otherPhone = new Phone("iPhone 8", "arm64", 64, "356550105461630");
        phone.call(otherPhone);
    }
}
