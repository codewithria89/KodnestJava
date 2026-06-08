package CollectionFramework.LinkList;

import java.util.LinkedList;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();


        int n = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < n; i++) {
            String task = sc.nextLine();
            tasks.addFirst(task);
        }


        System.out.println("Number of tasks: " + tasks.size());
        System.out.println("Tasks:");


        for (String task : tasks) {
            System.out.println(task);
        }


        sc.close();
    }
}