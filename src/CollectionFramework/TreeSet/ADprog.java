package CollectionFramework.TreeSet;
import java.util.*;

public class ADprog {
    public static void main(String[] args) {
        ArrayDeque ref3 = new ArrayDeque();
        ref3.add(20);
        ref3.add(10);
        ref3.add(40);
        ref3.add(50);
        ref3.add(30);
        System.out.println("ArrayDeque : " + ref3);
// Collections.sort(ref3); not possible
        TreeSet ts1 = new TreeSet();
        ts1.addAll(ref3);
        System.out.println(ts1);
    }
}
