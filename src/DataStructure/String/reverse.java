package DataStructure.String;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = sc.next();
        String str = new String(s1);
        int size = str.length();
        char arr[] = str.toCharArray();
        char revArr[] = new char[size];
        int j= revArr.length-1;
        for(int i=0 ;i<=arr.length-1; i++)
        {
            revArr[j]= arr[i];
            j--;
        }
        String revStr = new String(revArr);
        System.out.println("Original string is : " + str);
        System.out.println("Reversed string is : " +revStr);
    }
}
