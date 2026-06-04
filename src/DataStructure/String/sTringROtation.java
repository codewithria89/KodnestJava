package DataStructure.String;

import java.util.Scanner;

public class sTringROtation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first string: ");
            String str1 = scanner.next();
            System.out.print("Enter second string: ");
            String str2 = scanner.next();
            if (str1.length() != str2.length())
            {
                System.out.println("The string \"" + str2 + "\" is not a rotation of \"" + str1 + "\"");
            }
            else
            {
                String combinedStr = str1 + str1;
                if (combinedStr.contains(str2)) {
                    System.out.println("The string \"" + str2 + "\" is a rotation of \"" + str1 + "\"");
                } else {
                    System.out.println("The string \"" + str2 + "\" is not a rotation of \"" + str1 + "\"");
                }
            }
            scanner.close();
        }
    }
