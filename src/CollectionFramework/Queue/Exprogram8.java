package CollectionFramework.Queue;
import java.util.*;
public class Exprogram8 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Read the number of initial tasks (n)
            int n = sc.nextInt();
            // Create a PriorityQueue to store task priorities
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            // Read and add n task priorities to the PriorityQueue
            for (int i = 0; i < n; i++) {
                pq.add(sc.nextInt());
            }
            // Read the new task priority to insert
            int newTask = sc.nextInt();
            pq.add(newTask);
            // Remove the highest-priority task from the queue
            pq.poll();
            // Print the updated queue of task priorities
            System.out.println("Updated Queue of Task Priorities:");
            while (!pq.isEmpty()) {
                System.out.print(pq.poll() + " ");
            }
            sc.close();
        }
}

//import java.util.Scanner;
//
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        int n = sc.nextInt();
//
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//
//        for (int i = 0; i < n; i++) {
//            pq.add(sc.nextInt());
//        }
//
//
//        int newTask = sc.nextInt();
//        pq.add(newTask);
//
//
//        System.out.println("Number of elements in the Priority Queue: " + pq.size());
//
//
//        sc.close();
//    }
//}
