package GraphTemplate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFSWithSet {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("A", List.of("B", "C"));
        graph.put("B", List.of("A", "D"));
        graph.put("C", List.of("A"));
        graph.put("D", List.of("B"));

        Set<String> visited = new HashSet<>();

        dfs(graph, "A", visited);
    }

    // 문자열 노드 DFS
    static void dfs(Map<String, List<String>> graph, String cur, Set<String> visited) {
        visited.add(cur);
        System.out.println(cur);

        for(String next : graph.get(cur)) {
            if(!visited.contains(next)) {
                dfs(graph, next, visited);
            }
        }
    }
}