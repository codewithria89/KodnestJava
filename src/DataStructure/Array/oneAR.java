package DataStructure;
import java.util.Scanner;

public class oneAR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int size = scan.nextInt();
        int a[] = new int[size];
        System.out.println("Enter elements :");
        for(int i=0; i<=a.length-1; i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println("Array elements are :");
        System.out.print("[");
        for(int i=0 ; i<=a.length-1; i++)
        {
            if(i != size-1)
            {
                System.out.print(a[i] + ", ");
            }
            else
            {
                System.out.print(a[i]);
            }
        }
        System.out.println("]");
    }
}
