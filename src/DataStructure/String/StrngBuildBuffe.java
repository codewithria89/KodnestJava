package DataStructure.String;

public class StrngBuildBuffe {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); //16
        sb.append("Java");
        System.out.println(sb.capacity());// 16
        System.out.println(sb.length()); //4
        sb.append(" is a programming language");
        System.out.println(sb.capacity());//34
        System.out.println(sb.length());//
        sb.append(" and object oriendted "); //34*2+2 = 70
        System.out.println(sb.capacity());
    }
}
