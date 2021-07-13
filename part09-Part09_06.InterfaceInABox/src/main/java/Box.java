import java.util.ArrayList;

public class Box implements Packable {
    private double maxCapacity;
    private ArrayList<Packable> packables;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.packables = new ArrayList<>();
    }

    public double weight() {
        double weight = 0;

        for (Packable packable: packables) {
            weight += packable.weight();
        }

        return weight;
    }

    public void add(Packable packable) {
        if (this.maxCapacity >= weight() + packable.weight()) {
            packables.add(packable);
        }
    }

    @Override
    public String toString() {
        return "Box: " + packables.size() + " items, total weight " + weight() + " kg";
    }

}
