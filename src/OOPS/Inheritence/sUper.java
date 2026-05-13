package OOPS.Inheritence;

class Parentt {
    Parentt(int a, int b) {
        System.out.println("Parent class constructor");
    }
}

class Childe extends Parentt {
    Childe() {
        super(10, 20);
        System.out.println("Child class constructor");
    }
}

public class sUper {
    public static void main(String[] args) {
        Childe c = new Childe();
    }
}
