package datastructure.arrayList;

import java.util.ArrayList;

public class ArrayListEx01 {
    public static void main(String[] args){
        ArrayList listA = new ArrayList(10);

        /*
            ArrayList는 객체만 저장할 수 있는데 어떻게  listA.add(1)가 가능한 것일까?
            컴파일러가 해주는 autoboxing에 의해서 기본형이 참조형으로 자동으로 변환되기 때문이다.
            listA.add(1)가 autoboxing에 의해서 listA.add(new Integer(1))가 된다.
         */
        listA.add(1);
        listA.add(13);
        listA.add(new Integer(4));
        listA.add(new Integer(11));
        listA.add(new Integer(41));

        ArrayList listB = new ArrayList(listA.subList(1,4));

        System.out.println(listA);
        System.out.println(listB);

        listB.add("하이");

        System.out.println(listB);
    }
}
