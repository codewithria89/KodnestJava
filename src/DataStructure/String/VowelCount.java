package DataStructure.String;

import java.util.Scanner;

public class VowelCount {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the String :");
            String str = scan.nextLine();
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            System.out.println("Original String is : " + str);
            System.out.println("Num of vowls are : " + count);
        }
    }

