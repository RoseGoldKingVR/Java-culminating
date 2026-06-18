import java.util.ArrayList;
 
public class ArrayManipulation {
    public static void main(String[] args) {
 
        // ── a. Create ─────────────────────────────────────────────────
        System.out.println("===== a. Create an Array =====");
 
        // Fixed-size primitive array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("int[] numbers: ");
        printArray(numbers);
 
        // Dynamic ArrayList (can grow and shrink)
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("ArrayList fruits: " + fruits);
 
        // ── b. Add ───────────────────────────────────────────────────
        System.out.println("\n===== b. Add to an Array =====");
 
        // Add to end
        fruits.add("Dragonfruit");
        System.out.println("After add('Dragonfruit')  : " + fruits);
 
        // Add at a specific index
        fruits.add(1, "Blueberry");
        System.out.println("After add(1, 'Blueberry') : " + fruits);
 
        // ── c. Remove ─────────────────────────────────────────────────
        System.out.println("\n===== c. Remove an Element =====");
 
        // Remove by value
        fruits.remove("Banana");
        System.out.println("After remove('Banana')    : " + fruits);
 
        // Remove by index
        fruits.remove(0);  // removes "Apple"
        System.out.println("After remove(index 0)     : " + fruits);
 
        System.out.println("\nFinal list size: " + fruits.size());
    }
 
    // Helper to print a primitive int array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
