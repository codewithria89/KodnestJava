package DataStructure.String;

public class subString {

    public static void main(String[] args) {
         String str = "KodNest";
        for (int i = 0; i <str.length() ; i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                temp = temp + str.charAt(j);
                System.out.println(temp);
            }
        }
    }
}
