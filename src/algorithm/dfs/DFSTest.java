package algorithm.dfs;

import java.util.ArrayList;

public class DFSTest {
    public static void main(String[] args) {
        // ArrayList를 스택으로 변경하는 연습도 해보기
        ArrayList<String> aList = new ArrayList<String>();

        aList.add("A");
        aList.add("B");
        String node = aList.remove(aList.size() - 1);
        System.out.println(aList);
    }
}
