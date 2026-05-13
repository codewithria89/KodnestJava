import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scan.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        int i=1;
        while(i<=n)
        {
            if(i%2 == 0)
            {
                System.out.println("Even : " +i);
                evenSum = evenSum+i;
            }
            else
            {
                System.out.println("Odd : " +i);
                oddSum = oddSum+i;
            }
            i++;
        }
        System.out.println("Even sum is : " + evenSum);
        System.out.println("Odd sum is : " + oddSum);
    }
}
