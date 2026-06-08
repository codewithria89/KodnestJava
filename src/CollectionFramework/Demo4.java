package CollectionFramework;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Demo4 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.print("[");
        for(int i = 0; i <= al.size()-1;i++) {
            if (i == al.size()-1) {
                System.out.print(al.get(i));
            } else {
                System.out.print(al.get(i) + ", ");
            }
        }
        System.out.print("]");
    }
}
