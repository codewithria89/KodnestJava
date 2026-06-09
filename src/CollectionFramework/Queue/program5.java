package CollectionFramework.Queue;
import java.util.*;
public class program5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayDeque<Integer> queue = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                queue.addLast(sc.nextInt());
            }
            int frontCustomer = sc.nextInt();
            queue.addFirst(frontCustomer);

            int endCustomer = sc.nextInt();
            queue.addLast(endCustomer);

            queue.removeFirst(); // removes 205
            queue.removeFirst(); // removes 201


            System.out.println("Updated Queue of Customer IDs:");
            for (Integer id : queue) {
                System.out.print(id + " ");
            }


            sc.close();
        }
    }

