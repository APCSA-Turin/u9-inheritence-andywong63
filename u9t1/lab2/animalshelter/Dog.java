package u9t1.lab2.animalshelter;

public class Dog extends Animal {
    private boolean hasBeenWalked;
    private int barks;

    public Dog(String name, int age, String color) {
        super(name, age, color);
        hasBeenWalked = false;
        barks = 0;
    }

    public void walk() {
        hasBeenWalked = true;
        System.out.println(getName() + " has been walked!");
    }

    public boolean getHasBeenWalked() {
        return hasBeenWalked;
    }


    public int getBarks() {
        return barks;
    }

    public void bark() {
        System.out.println(getName() + " has barked! (" + barks + " barks)");
    }
}