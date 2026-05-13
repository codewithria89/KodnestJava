package OOPS.Inheritence;
class Parents{
    void  display1() {
        System.out.println("Inside parent display1");
    }
}

class Child1 extends  Parents {
    void display2() {
        System.out.println("Inside child1");
    }
}

class  Child2 extends  Child1 {

    void display3() {
        System.out.println("Inside chilw2");
    }
}
public class MultiM {
    public static void main(String[] args) {
         Child2 ch2 = new Child2();
         ch2.display1();
         ch2.display2();
         ch2.display3();
    }
}
