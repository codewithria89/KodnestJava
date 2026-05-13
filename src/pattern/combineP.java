package pattern;

import java.util.Scanner;

public class combineP {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    patU U = new patU();
    U.printUpper(N);

    patL L = new patL();
    L.printLower(N);
    }
}
class patU{
    void printUpper(int N){
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <N - i -1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i +1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <N - i -1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class patL{
    void printLower(int N){
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*N - (2*i +1) ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}