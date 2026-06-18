import java.util.HashMap;
import java.util.Map;
 
public class Inventory {
    public static void main(String[] args) {
 
        // --- Create the inventory (acts as our database) ---
        HashMap<String, Integer> inventory = new HashMap<>();
 
        // Add items to the inventory
        inventory.put("Apples",  50);
        inventory.put("Bananas", 30);
        inventory.put("Oranges", 0);   // Out of stock
        inventory.put("Grapes",  15);
 
        // --- Display the full inventory ---
        System.out.println("===== Full Inventory =====");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }
 
        // --- Check availability of specific items ---
        System.out.println("\n===== Availability Check =====");
        checkItem(inventory, "Apples");
        checkItem(inventory, "Oranges");
        checkItem(inventory, "Mangoes");  // Not in inventory
    }
 
    // Helper: check if an item is available and print its quantity
    public static void checkItem(HashMap<String, Integer> inventory, String item) {
        if (inventory.containsKey(item)) {
            int qty = inventory.get(item);
            if (qty > 0) {
                System.out.println(item + " is AVAILABLE. Quantity: " + qty);
            } else {
                System.out.println(item + " is OUT OF STOCK.");
            }
        } else {
            System.out.println(item + " is NOT in the inventory.");
        }
    }
}
