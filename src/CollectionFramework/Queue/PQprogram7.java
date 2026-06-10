package CollectionFramework.Queue;
import java.util.*;
public class PQprogram7 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(Collections.reverseOrder());
        pq.add(100);
        pq.add(25);
        pq.add(75);
        pq.add(50);
        pq.add(150);
        pq.add(125);
        pq.add(175);
        System.out.println(pq);
    }
}
