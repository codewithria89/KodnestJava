package DataStructure;

import java.util.Scanner;

public class OneDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter elements:");
        for (int i = 0; i <=4; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i <=4; i++) {
            System.out.println("Element: " + a[i]);
        }
    }
}
