package algorithm.dfs;

import java.util.ArrayList;

public class DFSTest02 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        graph.add(new ArrayList<Integer>());
        graph.add(new ArrayList<Integer>());

        // 노드 0에 연결된 노드 정보 저장
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(0).add(3);

        // 노드 1에 연결된 노드 정보 저장
        graph.get(1).add(4);
        graph.get(1).add(5);

        System.out.println(graph.get(0));
        System.out.println(graph.get(0).get(2));
        System.out.println(graph.get(1));
    }
}
