package OOPS.Inheritence;

class Parent{
    void display() {
        System.out.println("Inside the Parent display");
    }
}

class Child extends Parent {

}

public class Main {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();
    }
}
