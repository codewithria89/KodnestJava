package CollectionFramework;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
       ArrayList al = new ArrayList();
//        al.add(10);
//        al.add(20);
//        al.add(30);
//        al.add(40);
//        al.add(50);
//        System.out.println(al);
//        System.out.println(al.size());
//        System.out.println(al.contains(77));
//        System.out.println(al.contains(40));
//        System.out.println(al.get(2));
//        System.out.println(al.getFirst());
//        System.out.println(al.getLast());
//        System.out.println(al.indexOf(40));
//        System.out.println(al.isEmpty());
//        al.remove(4);
//        System.out.println(al);
//        al.add(20);
//        System.out.println(al);
//        System.out.println(al.lastIndexOf(20));
//        al.removeFirst();
//        System.out.println(al);
//        al.removeLast();
//        System.out.println(al);
//        al.set(2, "HTML");
//        System.out.println(al);
//        al.addFirst(99);
//        System.out.println(al);
//        al.addLast(88);
//        System.out.println(al);
//        al.add(100);
//        System.out.println(al);
//        al.add(2, 77);
//        System.out.println(al);
//        ArrayList al1 = new ArrayList();
//        al1.add("A");
//        al1.add(33);
//        al1.add(34.5);
//        al.addAll(al1);
//        System.out.println(al);

                al.add(10);
                al.add(20);
                al.add(30);
                al.add(40);
                al.add(50);

                System.out.println(al);
                System.out.println(al.size());
                System.out.println(al.contains(77));
                System.out.println(al.contains(40));
                System.out.println(al.get(2));

                // getFirst() and getLast()
                System.out.println(al.get(0));
                System.out.println(al.get(al.size() - 1));

                System.out.println(al.indexOf(40));
                System.out.println(al.isEmpty());

                al.remove(4);
                System.out.println(al);

                al.add(20);
                System.out.println(al);

                System.out.println(al.lastIndexOf(20));

                // removeFirst()
                al.remove(0);
                System.out.println(al);

                // removeLast()
                al.remove(al.size() - 1);
                System.out.println(al);

                al.set(2, "HTML");
                System.out.println(al);

                // addFirst()
                al.add(0, 99);
                System.out.println(al);

                // addLast()
                al.add(88);
                System.out.println(al);

                al.add(100);
                System.out.println(al);

                al.add(2, 77);
                System.out.println(al);

                ArrayList al1 = new ArrayList();
                al1.add("A");
                al1.add(33);
                al1.add(34.5);

                al.addAll(al1);
                System.out.println(al);
            }
}

