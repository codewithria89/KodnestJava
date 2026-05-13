package OOPS.Polymorphism;
 class Paarent {
    void disp1()
    {
        System.out.println("Inside Parent disp1");
    }
    void disp2()
    {
        System.out.println("Inside Parent disp2");
    }
}

class Child11 extends Paarent
{
    @Override
    void disp2()
    {
        System.out.println("Inside Child disp2");
    }
    void disp3()
    {
        System.out.println("Inside Child disp3");
    }
}
class Child2 extends Paarent
{
    @Override
    void disp2()
    {
        System.out.println("Inside Child2 disp2");
    }
    void disp3()
    {
        System.out.println("Inside Child2 disp3");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Child11 c1 = new Child11();
        accessMethod(c1);

        Child2 c2 = new Child2();
        accessMethod(c2);
    }
    static void accessMethod(Paarent ref) {
        ref.disp1();
        ref.disp2();

        if (ref instanceof Child11) {
            ((Child11)(ref)).disp3();
        }
        else {
            ((Child2)(ref)).disp3();
        }
    }
}
