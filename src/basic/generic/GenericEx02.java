package basic.generic;

import java.util.ArrayList;

public class GenericEx02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(11);
//        list.add("11");  -> 예제 1과 달리 컴파일 시에 오류를 잡아준다.
    }
}
