import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (shoppingCart.containsKey(product)) {
            increaseQuantity(product);
        } else {
            shoppingCart.put(product, new Item(product, 1, price));
        }
    }

    public void increaseQuantity(String product) {
        shoppingCart.get(product).increaseQuantity();
    }

    public int price() {
        int totalPrice = 0;

        for (Item item: shoppingCart.values()) {
            totalPrice += item.price();
        }

        return  totalPrice;
    }

    public void print() {
        for (String string: shoppingCart.keySet()) {
            System.out.println(shoppingCart.get(string));
        }
    }
}
