package OOPS;

import java.util.Scanner;

public class tempreature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle Input
        String shape1 = sc.next();
        int width = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("The area of the rectangle is: " + AreaCalculator.rectangle(width, height));

        // Circle Input
        String shape2 = sc.next();
        double radius = sc.nextDouble();
        System.out.println("The area of the circle is: " + AreaCalculator.circle(radius));
    }
}

class AreaCalculator {
    // Static method for rectangle area
    static int rectangle(int m, int n) {
        return m * n;
    }

    // Static method for circle area
    static double circle(double r) {
        return Math.PI * r * r;
    }
}
