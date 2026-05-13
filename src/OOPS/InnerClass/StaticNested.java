package OOPS.InnerClass;

class Pror1 {
    int a = 10;
    static class Prro2 {
        static int b = 20;
        static void disPrro2() {
            System.out.println(b);
        }
    }
    void disPror1() {
        System.out.println(a);
    }
}

public class StaticNested {
    public static void main(String[] args) {
        Pror1 p1 = new Pror1();
        p1.disPror1();

        Pror1.Prro2.disPrro2();
    }
}
