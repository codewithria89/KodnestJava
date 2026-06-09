package CollectionFramework.ArrayList;
import java.util.*;

public class adding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the number of strings
        int n = sc.nextInt();
        // Create an ArrayList to store strings
        ArrayList<String> list = new ArrayList<>();
        // Add strings to the ArrayList
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        // Read index and new string
        int index = sc.nextInt();
        String newString = sc.next();
        // Insert new string at the specified index
        list.add(index, newString);
        // Print the updated ArrayList
        System.out.print("Updated ArrayList: ");
        for (String str : list) {
            System.out.print(str + " ");
        }
        sc.close();
    }
}
