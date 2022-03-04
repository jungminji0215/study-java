package basic;

public class SwapEx01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
