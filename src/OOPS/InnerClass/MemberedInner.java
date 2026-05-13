package OOPS.InnerClass;

class Pro1 {
    int a = 10;
    class  Pro2 {
        int b = 20;

        void disPro2() {
            System.out.println(a);
            System.out.println(b);
        }
    }
    void disPro1() {
        System.out.println(a);
    }
}
public class MemberedInner {
    public static void main(String[] args) {
        Pro1 p1 = new Pro1();
        p1.disPro1();
        Pro1.Pro2 p2 = p1.new Pro2();
        p2.disPro2();
    }
}
