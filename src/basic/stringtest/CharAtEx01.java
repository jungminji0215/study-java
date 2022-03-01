package basic.stringtest;

public class CharAtEx01 {
    public static void main(String[] args) {
        String str = "ABCDEFG";

        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(2);

        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);

        // 결과는 ABC가 아닌 198이 나온다.
        // 문자는 더하기 기호와 함께 남겨지면
        // 각각의 아스키 코드 값인 65, 66, 67이 더해진 198이 되었다.
        System.out.println(ch1 + ch2 + ch3);
        System.out.println(ch1 + "" + ch2 + ch3 );
    }
}
