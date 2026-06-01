package DataStructure.String;


public class spliy {
    public static void main(String[] args) {
        String text = "Java is easy to learn";
        String word[] = text.split(" ");
        for (int i =0; i <= word.length-1; i++) {
            System.out.println(word[i]);
        }
        String result = text.join("-", word);
        System.out.println(text);
        System.out.println(result);
    }
}
