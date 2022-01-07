package datastructure.array;

import java.util.Arrays;

/*
    배열 : 순차적으로 나열된 같은 종류의 데이터들의 묶음이며,
    데이터를 인덱스로 접근할 수 있는 구조이기 때문에 빠르게 데이터를 찾을 수 있다.
 */
public class Array {
    public static void main(String[] args) {
        array();
        arrayInteger();


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

    // 일반 배열
    static void array(){
        // 참조 변수 arrayBasic 생성
        int[] arrayBasic;

        // 5개의 요소(저장 공간) 생성
        arrayBasic = new int[5];
        arrayBasic[0] = 1;

        System.out.println("일반 배열 선언해 봄 " + Arrays.toString(arrayBasic));

        /*
            자바는 JVM이 모든 배열의 길이를 별도로 관리한다.
            따라서 배열이름.length를 통해서 배열의 길이를 얻을 수 있다.
         */
        System.out.println("배열 길이 " + arrayBasic.length);
    }

    // Integer 타입 배열 선언
    static  void arrayInteger(){
        // 배열 선언 후 데이터 넣기
        Integer[] data_list1 = new Integer[10];
        data_list1[0] = 1;
        System.out.println("Integer 배열1 " + Arrays.toString(data_list1));

        // 배열 선언과 동시에 데이터 넣기 - 미리 배열의 길이를 지정하지 않아도 된다.
        Integer[] data_list2 = {0,2,1,5};

        // 주소 출력해 보기
        System.out.println("Integer 배열2의 주소 " + data_list2);
    }
}

