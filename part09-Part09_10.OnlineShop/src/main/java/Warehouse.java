import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> warehouse;
    private Map<String, Integer> stockBalance;

    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        warehouse.put(product, price);
        stockBalance.put(product, stock);
    }

    public int price(String product) {
        if (warehouse.containsKey(product)) {
            return warehouse.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (stockBalance.containsKey(product)) {
            return stockBalance.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (stock(product) > 0) { // calling the stock method to find if there is something in the stock
            stockBalance.put(product, stockBalance.get(product) - 1);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        // creates new HashSet containing all keys from warehouse
        return new HashSet<>(warehouse.keySet());
    }
}
