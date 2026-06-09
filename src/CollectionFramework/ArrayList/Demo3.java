package CollectionFramework.ArrayList;
import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        System.out.println("FOR LOOP");
        for(int i=0 ;i<=al.size()-1; i++)
        {
            System.out.println(al.get(i));
        }
        System.out.println("ADV FOR LOOP");
        for(Object x : al)
        {
            System.out.println(x);
        }
    }
}
