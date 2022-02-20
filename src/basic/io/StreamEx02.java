package basic.io;

import java.io.InputStream;
import java.io.InputStreamReader;

public class   StreamEx02 {
    public static void main(String[] args) {
        InputStream in = System.in;
        InputStreamReader ir = new InputStreamReader(in); // 자동 길이 조절 안됨

        try {
            char[] data = new char[3];
            System.out.println("ㅋㅋㅋㅋ");
            ir.read(data);
            System.out.println(data);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
