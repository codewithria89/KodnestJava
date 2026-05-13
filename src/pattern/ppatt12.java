package pattern;

import java.util.Scanner;

public class ppatt12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        pateeU U = new pateeU();
        U.printUpper(N);

        pateeL L = new pateeL();
        L.printLower(N);
    }
}
class pateeU{
    void printUpper(int N) {
        for (int i = 1; i <=N ; i++) {
            for (int k = 1; k <= N-i+1 ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class pateeL{
    void printLower(int N) {
        for (int i = 1; i <=N ; i++) {
            for (int k = 1; k <=i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= N-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}