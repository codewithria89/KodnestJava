package CollectionFramework.ArrayList;
import java.util.*;

public class Demo5 {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
        public static void main(String[] args) {
            ArrayList al = new ArrayList();
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);

            Iterator itr = al.iterator();
            System.out.print("[");
            while(itr.hasNext())
            {
                System.out.print(itr.next());
                if(itr.hasNext() == true)
                {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

