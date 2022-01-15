package algorithm.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class DFSSearch {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();
        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "E", "F", "G")));
        graph.put("D", new ArrayList<String>(Arrays.asList("B", "H", "I")));
        graph.put("E", new ArrayList<String>(Arrays.asList("C")));
        graph.put("F", new ArrayList<String>(Arrays.asList("C")));
        graph.put("G", new ArrayList<String>(Arrays.asList("C", "J")));
        graph.put("H", new ArrayList<String>(Arrays.asList("D")));
        graph.put("I", new ArrayList<String>(Arrays.asList("D")));
        graph.put("J", new ArrayList<String>(Arrays.asList("G")));

        System.out.println(dfsSearch(graph, "A"));
    }

    public static ArrayList<String> dfsSearch(HashMap<String, ArrayList<String>> graph, String startNode){
        ArrayList<String> visited = new ArrayList<String>();
        Stack<String> stack = new Stack<String>();

        stack.push(startNode);

        while(stack.size() > 0){
            String node = stack.pop();

            if(!visited.contains(node)){
                visited.add(node);
                stack.addAll(graph.get(node));
            }
        }
        return visited;
    }
}
