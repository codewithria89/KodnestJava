package CollectionFramework.Queue;

import java.util.*;
public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new LinkedList();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.poll());//null
    }
}
