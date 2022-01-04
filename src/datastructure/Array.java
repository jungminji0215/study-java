package datastructure;

import java.util.Arrays;

/*
배열 : 순차적으로 나열된 같은 종류의 데이터들의 묶음이며, 데이터를 인덱스로 접근할 수 있는 데이터 구조이다.
인덱스로 접근하므로 빠르게 데이터를 찾을 수 있다.
 */
public class Array {
    public static void main(String[] args) {
        // 배열 선언 후 데이터 넣기
        Integer[] data_list1 = new Integer[10];
        data_list1[0] = 1;

        // 배열 선언과 동시에 데이터 넣기
        Integer[] data_list2 = {0,2,1,5};
        System.out.println(data_list2);

        // Arrays 클래스 사용히여 전체 배열 출력
        System.out.println(Arrays.toString(data_list1));

        //궁금해서 해보는, Integer와 int 차이 테스트
        int[] test_int = new int[10];
        test_int[0] = 1;
        System.out.println(test_int);
        System.out.println(test_int[1]); // 0
        System.out.println(Arrays.toString(test_int)); // [1, null, null, null, null, null, null, null, null, null]

        Integer[] test_integer = new Integer[10];
        test_integer[0] = 1;
        System.out.println(test_integer);
        System.out.println(test_integer[1]); // null
        System.out.println(Arrays.toString(test_integer)); // [1, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    }
}
