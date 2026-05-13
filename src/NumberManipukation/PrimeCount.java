package NumberManipukation;
import java.util.Scanner;
public class PrimeCount {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter start number : ");
                int start = scan.nextInt();
                System.out.println("Enter end number : ");
                int end = scan.nextInt();
                int count = 0;
                if (start == 1) {
                    start++;
                }
                for (int i = start; i <= end; i++) {
                    if (findPrime(i)) {
                        count++;
                    }
                }
                System.out.println("Total prime numbers: " + count);
            }

            static boolean findPrime(int n) {
                if (n < 2) return false;

                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
}
