import java.util.Scanner;

public class factori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value:");
        int num = sc.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= num){
            fact = fact * i;
            i++;
        }
        System.out.println("Value" + num + " is: " + fact);
    }
}
