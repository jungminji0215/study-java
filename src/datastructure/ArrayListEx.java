package datastructure;
import java.util.ArrayList;

/*
    List 인터페이스 - 중복을 허용하며 저장순서가 유지
    ArrayList : List 인터페에스를 구현한 클래스

    가변 길이의 배열을 다룰 수 있으므로, 미리 길이를 지정해야 하는 단순 배열의 불편함을 해결
 */

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(17);
        list1.add(13);

        list1.get(0);
        System.out.println(list1);
    }
}
