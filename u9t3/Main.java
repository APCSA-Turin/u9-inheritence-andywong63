package u9t3;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(15, 8192);
        laptop.installOperatingSystem();
        laptop.printInfo();
    }
}
