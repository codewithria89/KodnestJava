package DataStructure.String;

public class selfEnsure {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(40);
        System.out.println(sb.capacity());
    }
}
