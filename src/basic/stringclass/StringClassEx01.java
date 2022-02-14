package basic.stringclass;

public class StringClassEx01 {
    public static void main(String[] args) {
        String a = "1";
        String b = "1";
        String c = new String("1");
        String d = new String("1");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println(c == d);

        String e = c.intern();

        System.out.println(a == e);
        System.out.println(b == e);
    }
}
