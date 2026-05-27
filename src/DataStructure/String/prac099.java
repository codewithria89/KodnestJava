package DataStructure.String;

public class prac099 {
        public static void main(String[] args) {
            String s3 = new String("Raja");
            String s4 = new String("RAJA");
            if (s3.equals(s4)) {
                System.out.println("Contents are same");
            } else {
                System.out.println("Contents are NOT - same");
            }
            if (s3 == s4) {
                System.out.println("Addresses are Same");
            } else {
                System.out.println("Addresses are not-Same");
            }
        }
    }