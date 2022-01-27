package basic.generic;

import java.util.ArrayList;

public class GenericEx01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(10);
        list.add(11);
        // 숫자만 넣고싶은데 실수로 다른 자료형 넣어도 실수를 막을 수 없다.
        list.add("11");

        Integer i = (Integer) list.get(2);

        System.out.println(i);

        // 이대로 실행하면 오류난다.
    }
}
