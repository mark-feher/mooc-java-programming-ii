import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> itemsInMaxWeightBox;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.itemsInMaxWeightBox = new ArrayList<>();
    }

    public int amountStored() {
        int amount = 0;

        for (Item item: itemsInMaxWeightBox) {
            amount += item.getWeight();
        }

        return amount;
    }

    @Override
    public void add(Item item) {
        if (amountStored() + item.getWeight() <= this.maxWeight) {
            itemsInMaxWeightBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (itemsInMaxWeightBox.contains(item)) {
            return true;
        }
        return false;
    }
}
