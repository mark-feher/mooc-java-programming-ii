public class Container {
    private int amountOfLiquid;

    public Container() {
        this.amountOfLiquid = 0;
    }

    public int contains() {
        return this.amountOfLiquid;
    }

    public void add(int amountOfLiquidToAdd) {
        if (this.amountOfLiquid + amountOfLiquidToAdd >= 100) {
            this.amountOfLiquid = 100;
        } else if (amountOfLiquidToAdd >= 0) {
            this.amountOfLiquid += amountOfLiquidToAdd;
        } else return;
    }

    public void remove(int amountOfLiquidToRemove) {
        if (this.amountOfLiquid - amountOfLiquidToRemove <= 0) {
            this.amountOfLiquid = 0;
        } else if (amountOfLiquidToRemove > 0) {
            this.amountOfLiquid -= amountOfLiquidToRemove;
        } else return;
    }

    @Override
    public String toString() {
        return this.amountOfLiquid + "/100";
    }
}
