package DataStructure.String;

import java.util.Scanner;

public class StringOccurenceCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = scan.nextLine();
        for(int i=0; i<=str.length()-1; i++)
        {
            char ch = str.charAt(i);
            int count = 0;
            if(str.indexOf(ch) != i)
            {
                continue;
            }
            for(int j=0; j<=str.length()-1; j++)
            {
                if(ch == str.charAt(j))
                {
                    count++;
                }
            }
            System.out.println(ch + ": " +count);
        }
    }
}