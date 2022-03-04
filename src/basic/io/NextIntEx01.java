package basic.io;

import java.util.Scanner;

public class NextIntEx01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;

        // N, M을 공백을 기준으로 구분하여 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(n);
        System.out.println(m);
    }
}
