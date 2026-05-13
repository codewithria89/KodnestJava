package OOPS;
import  java.util.Scanner;
public class MathMacine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operation) {
            case "Addition":
                System.out.println("The result of Addition is: " + MathOperations.addition(a, b));
                break;
            case "Subtraction":
                System.out.println("The result of Subtraction is: " + MathOperations.subtraction(a, b));
                break;
            case "Multiplication":
                System.out.println("The result of Multiplication is: " + MathOperations.multiplication(a, b));
                break;
            case "Division":
                System.out.println("The result of Division is: " + MathOperations.division(a, b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
class MathOperations {
    public static int addition(int a, int b) {
        return a + b;
    }
    // Static method for subtraction
    public static int subtraction(int a, int b) {
        return a - b;
    }
    // Static method for multiplication
    public static int multiplication(int a, int b) {
        return a * b;
    }
    // Static method for division
    public static int division(int a, int b) {
        return a / b;
    }
}

