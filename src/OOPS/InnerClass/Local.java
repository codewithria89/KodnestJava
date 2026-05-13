package OOPS.InnerClass;

class Program1 {
    int a = 10;
    void myMethod()
    {
        class Program2
        {
            int b = 20;
            void dispProgram2()
            {
                System.out.println(b);
            }
        }
        Program2 p2 = new Program2();
        p2.dispProgram2();
    }
    void dispProgram1()
    {
        System.out.println(a);
    }
}

public class Local {
    public static void main(String[] args) {
        Program1 p1 = new Program1();
        p1.myMethod();
        p1.dispProgram1();
}
}
