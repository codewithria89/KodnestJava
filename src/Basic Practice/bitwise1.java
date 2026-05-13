public class bitwise1 {
    public static void main(String[] args) {
        var a = 10;
       // var b = ++a;
        //var b = a++;
        //var b = --a;
        //var b = a--;
        //var b = ++a + a++ + --a + a++ + a-- + --a;
        var b = ++a + ++a - a++ + a++;
        System.out.println(a);
        System.out.println(b);
    }
}
