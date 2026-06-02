package DataStructure.String;

import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String1 :");
        String s1 = scan.next();
        System.out.println("Enter the String2 :");
        String s2 = scan.next();
        if(s1.length() != s2.length()) {
            System.out.println("Strings are NOT Anagrams");
            return;
        }
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sortedStr1 = new String(arr1);
        String sortedStr2 = new String(arr2);
        if(sortedStr1.equals(sortedStr2))
        {
            System.out.println("Strings are Anagrams");
        }
        else
        {
            System.out.println("Strings are NOT Anagrams");
        }
    }
}