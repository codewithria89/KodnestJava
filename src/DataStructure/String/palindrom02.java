package DataStructure.String;

import java.util.Scanner;

public class palindrom02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("EEnter the String: ");
        String s1 = sc.next();
        String str = new String(s1);
        int left = 0;
        int right = str.length() - 1;
         while (left< right) {
             if (str.charAt(left) != str.charAt(right)) {
                 System.out.println(str + " is not a palindrome");
                 return;
             }
             left++;
             right--;
         }
        System.out.println(str + " is a palindrome");
    }
}
