import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Modify elements
        fruits.set(1, "Mango"); // Replace "Banana" with "Mango"

        // Remove elements
        fruits.remove(2); // Removes "Orange"

        // Iterate through the ArrayList
        System.out.println("Fruits list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check size
        System.out.println("Total fruits: " + fruits.size()); // Output: 2

        // Clear all elements
        fruits.clear();
        System.out.println("Is the list empty? " + fruits.isEmpty()); // Output: true
    }
}
