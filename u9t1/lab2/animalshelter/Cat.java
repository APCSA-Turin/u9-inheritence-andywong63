package u9t1.lab2.animalshelter;

public class Cat extends Animal {
    private boolean hasPlayedWith;
    private int scratches;

    public Cat(String name, int age, String color) {
        super(name, age, color);
        hasPlayedWith = false;
        scratches = 0;
    }

    public void play() {
        hasPlayedWith = true;
        System.out.println(getName() + " has been played with!");
    }

    public boolean getHasPlayedWith() {
        return hasPlayedWith;
    }


    public int getScratches() {
        return scratches;
    }

    public void scratch() {
        System.out.println(getName() + " has scratched! (" + scratches + " scratches)");
    }
}