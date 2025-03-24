package u9t5;

public class Main {
    public static void main(String[] args) {
        Animal thing = new Animal("Thing");
        Puppy spot = new Puppy("Spot");
        Cow marge = new Cow("Marge");
        Dog penny = new Dog("Penny");

        Vet vet = new Vet("Andy");
        System.out.println(vet.addClient(thing));
        System.out.println(vet.addClient(spot));
        System.out.println(vet.addClient(marge));
        System.out.println(vet.addClient(penny));
        System.out.println();
        System.out.println(vet.addClient(thing));
        System.out.println(vet.addClient(spot));
        System.out.println(vet.addClient(marge));
        System.out.println(vet.addClient(penny));
        System.out.println();
        vet.printClientList();
    }
}
