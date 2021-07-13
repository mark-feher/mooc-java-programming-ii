public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String place, int salary) {
        super(name, place);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }
}
