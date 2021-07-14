import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    @Override
    public String toString() {
        String returnString = "";

        for (Movable movablePartOfHerd: herd) {
            returnString += movablePartOfHerd + "\n";
        }
        return returnString;
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movablePartOfHerd: herd) {
            movablePartOfHerd.move(dx, dy);
        }
    }
}
