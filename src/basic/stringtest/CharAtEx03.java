package basic.stringtest;

// 알고리즘 문제 풀다가 만난  charAt(int i) -'0' 을 알아보기 위한
public class CharAtEx03 {
    public static void main(String[] args) {
        String str = "11";

        char ch = str.charAt(0);

        System.out.println(ch);
        System.out.println(Integer.parseInt(String.valueOf(ch)));

    }



}
