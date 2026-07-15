package GraphTemplate;

import java.util.ArrayList;
import java.util.List;

public class DFSWithArray {
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();

        graph.add(List.of(1, 3, 6));
        graph.add(List.of(0, 3));
        graph.add(List.of(3));
        graph.add(List.of(0, 1, 2, 7));
        graph.add(List.of(5));
        graph.add(List.of(4, 6, 7));
        graph.add(List.of(0, 5));
        graph.add(List.of(3, 5));

        boolean[] visited = new boolean[graph.size()];

        dfs(graph, 0, visited);
    }

    // 숫자 노드 DFS
    static void dfs(List<List<Integer>> graph, int cur, boolean[] visited) {
        visited[cur] = true;
        System.out.println(cur);

        for(int next : graph.get(cur)) {
            if(!visited[next]) {
                dfs(graph, next, visited);
            }
        }
    }
}