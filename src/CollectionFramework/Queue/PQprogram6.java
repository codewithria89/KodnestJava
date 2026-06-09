package CollectionFramework.Queue;
import java.util.*;

public class PQprogram6 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(25);
        pq.add(75);
        pq.add(50);
        pq.add(150);
        pq.add(125);
        pq.add(175);
// System.out.println(pq);[25, 50, 75, 100, 150, 125, 175]
        while(!pq.isEmpty())
        {
            System.out.print(pq.poll() + " ");//25 50 75 100 125 150 175
        }
    }
}
