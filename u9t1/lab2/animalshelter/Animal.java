package u9t1.lab2.animalshelter;

public class Animal {
    private String name;
    private int age;
    private String color;
    private boolean vaccinated;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        vaccinated = false;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isVaccinated() {
        return vaccinated;
    }

    public void adopt() {
        System.out.println(name + " has been adopted!");
    }
    public void feed() {
        System.out.println(name + " has been fed!");
    }


    public String getColor() {
        return color;
    }

    public void vaccinate() {
        vaccinated = true;
        System.out.println(name + " has been vaccinated!");
    }
}