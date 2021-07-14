public abstract class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public void eat() {
        System.out.println(getName() + " eats");
    }

    public void sleep() {
        System.out.println(getName() + " sleeps");
    }

    public String getName() {
        return this.animalName;
    }
}
