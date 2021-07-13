public class LiquidContainer {
    private int amountOfLiquid;

    public LiquidContainer() {
        this.amountOfLiquid = 0;
    }

    public int getAmountOfLiquid() {
        return this.amountOfLiquid;
    }

    public void addAmount(int amountOfLiquidToAdd) {
        if (this.amountOfLiquid + amountOfLiquidToAdd >= 100) {
            this.amountOfLiquid = 100;
        } else if (amountOfLiquidToAdd >= 0) {
            this.amountOfLiquid += amountOfLiquidToAdd;
        } else return;
    }

    public void removeAmount(int amountOfLiquidToRemove) {
        if (this.amountOfLiquid - amountOfLiquidToRemove <= 0) {
            this.amountOfLiquid = 0;
        } else if (amountOfLiquidToRemove > 0) {
            this.amountOfLiquid -= amountOfLiquidToRemove;
        } else return;
    }
}
