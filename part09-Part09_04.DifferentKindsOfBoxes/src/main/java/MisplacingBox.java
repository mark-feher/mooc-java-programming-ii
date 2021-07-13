import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> misplacingBox;

    public MisplacingBox() {
        this.misplacingBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        misplacingBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        if (misplacingBox.contains(item)) {
            return false;
        }
        return false;
    }
}
