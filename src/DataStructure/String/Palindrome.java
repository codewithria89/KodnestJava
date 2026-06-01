package DataStructure.String;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1 = scan.next();
        String str = new String(s1);
        int size = str.length();
        char[] arr = str.toCharArray();
        char[] revArr = new char[size];
        int j= revArr.length-1;
        for(int i=0 ;i<=arr.length-1; i++)
        {
            revArr[j]= arr[i];
            j--;
        }
        String revStr = new String(revArr);
        System.out.println("Original string is : " + str);
        System.out.println("Reversed string is : " +revStr);
        if(str.equals(revStr))
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is NOT_a Palindrome");
        }
    }
}
