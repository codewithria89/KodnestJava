package DataStructure.Array;

import java.util.Scanner;

public class p01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows:");
            int x = sc.nextInt();
            System.out.println("Enter number of columns:");
            int y = sc.nextInt();
            int a[][] = new int[x][y];
            System.out.println("Enter the elements");

            for (int i = 0; i <= a.length - 1; i++) {
                for (int j = 0; j <= a[i].length - 1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Array elements are: ");
            for (int i = 0; i <= a.length - 1; i++) {
                for (int j = 0; j <= a[i].length - 1; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
