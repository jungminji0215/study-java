package datastructure.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx03 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(7);
        list1.add(98);
        list1.add(new Integer(4));
        list1.add(4);
        list1.add(54);

        ArrayList list2 = new ArrayList(list1.subList(0, 2));

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

    }

}
