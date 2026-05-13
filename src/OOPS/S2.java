package OOPS;

public class S2 {
    public static void main(String[] args) {
        Program p1 = new Program();
        Program p2 = new Program();
        Program p3 = new Program();
        System.out.println("No. of object: " + Program.count);
    }
}
class Program {
    static  int count = 0;
    {
        count++;
    }
}
