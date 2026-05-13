import java.util.Scanner;

public class ScClasses {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a byte value: " );
        byte a = sc.nextByte();
        System.out.println("Byte value of a: " + a);
        System.out.println("Enter a short value: " );
        short b = sc.nextShort();
        System.out.println("Short value of b: " + b);
        System.out.println("Enter a integer value: " );
        int c = sc.nextInt();
        System.out.println("Integer value of c: " + c);
        System.out.println("Enter a long value: " );
        long d = sc.nextLong();
        System.out.println("Long value of d: " + d);
        System.out.println("Enter a float value: " );
        float e = sc.nextFloat();
        System.out.println("Float value of e: " + e);
        System.out.println("Enter a double value: " );
        double f = sc.nextDouble();
        System.out.println("Double value of f: " + f);
    }
}
