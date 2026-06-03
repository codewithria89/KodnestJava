package DataStructure.String;

import java.util.Scanner;

public class StringExtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        String resStr = "";
        for(int i=0; i<=str.length()-1; i++)
        {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9')
            {
                resStr= resStr+ch;
            }
        }
        System.out.println("Extracted digits are : " + resStr);
    }
}
