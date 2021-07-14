public class Dog extends Animal implements NoiseCapable{
    public Dog() {
        super("Dog");
    }

    public Dog(String animalName) {
        super(animalName);
    }

    public void bark() {
        System.out.println(getName() + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }
}
