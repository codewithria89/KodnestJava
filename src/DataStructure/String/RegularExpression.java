package DataStructure.String;

import java.util.Scanner;

public class RegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        if (s.matches("[a-zA-Z0-9]*")){
            System.out.println("Valid string");
        } else {
            System.out.println("Invalid string");
        }
    }
}
