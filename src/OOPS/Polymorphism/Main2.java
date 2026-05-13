package OOPS.Polymorphism;

class Parent {
    void  disp1() {
        System.out.println("Inside parent displ1");
    }
    void disp2() {
        System.out.println("Insiide parent disp2");
    }
}

class  Child extends Parent{
    @Override
    void disp2() {
        System.out.println("Inside child disp2");
    }
     void disp3() { // child specific method
         System.out.println("Inside child disp3");
     }
}

public class Main2 {
    public static void main(String[] args) {

        Parent p = new  Child();
        p.disp1();
        p.disp2();
        p.disp2(); // Error b'coz( Parent type regerence can not call child specific methods)

        //down typcasting

        ((Child)(p)).disp3();
    }
}
