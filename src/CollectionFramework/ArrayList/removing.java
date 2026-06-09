package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class removing {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Read the number of elements
            int n = sc.nextInt();
            // Create an ArrayList to store integers
            ArrayList<Integer> list = new ArrayList<>();
            // Add elements to the ArrayList
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            // Read index and remove the element
            int index = sc.nextInt();
            list.remove(index);
            // Print the updated ArrayList
            System.out.println("Updated ArrayList:");
            for (int num : list) {
                System.out.print(num + " ");
            }
            sc.close();
        }
    }
