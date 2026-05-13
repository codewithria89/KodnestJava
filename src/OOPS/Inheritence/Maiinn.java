package OOPS.Inheritence;

class Program {
    Program () {
        this(10);
        System.out.println("Inside Zero para constructor");
    }

    Program(int a) {
        this(10, 20);
        System.out.println("Inside one para constructor");
    }

    Program(int a, int b) {
        System.out.println("Inside two para constructor");
    }
}

public class Maiinn {
    public static void main(String[] args) {
        Program p = new Program();
    }
}
