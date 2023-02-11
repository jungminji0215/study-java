package datastructure.set;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertSetToList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        List<Integer> list = set.stream().collect(Collectors.toList());

        System.out.println(list);
    }
}
