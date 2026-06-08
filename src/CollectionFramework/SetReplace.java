package CollectionFramework;
import java.util.*;
public class SetReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read number of elements
        int n = scanner.nextInt();
        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // Populate the ArrayList
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        // Read index and new value
        int index = scanner.nextInt();
        int newValue = scanner.nextInt();
        // Update element using set()
        list.set(index, newValue);
        // Print updated ArrayList
        System.out.println("Updated ArrayList:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
