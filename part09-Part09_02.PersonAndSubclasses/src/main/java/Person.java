import java.util.ArrayList;

public class Person {
    private String name;
    private String place;

    public Person(String name, String place) {
        this.name = name;
        this.place = place;
    }

    @Override
    public String toString() {
        return this.name + "\n  " + this.place;
    }
}
