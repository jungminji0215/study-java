package datastructure.arrayList;

import java.util.ArrayList;

public class ArrayListEx02 {
    public static void main(String[] args) {
        ArrayList listA = new ArrayList(10);

        listA.add(1);
        listA.add(4);
        listA.add(5);
        listA.add("1");
        listA.add(12);

        listA.remove(1);
        System.out.println(listA);

        listA.remove(new Integer(1));
        System.out.println(listA);
    }
}
