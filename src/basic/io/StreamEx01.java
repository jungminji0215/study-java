package basic.io;

import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        InputStream in = System.in; // System.in -> 키보드, System.in을 통해서 키보드와 컴퓨터를 연결 함

        try {
            int data = in.read(); // 2진수를 10진수로 변환해서 읽어준다.
            // A입력 -> 인코딩 -> 01000001 -> 디코딩 -> 65
            System.out.println(data);
            System.out.println((char)data);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
