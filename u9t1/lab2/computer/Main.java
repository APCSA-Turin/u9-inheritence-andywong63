package u9t1.lab2.computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(18, 512);
        System.out.println(computer instanceof Desktop);
        System.out.println(computer instanceof Computer);
    }
}
