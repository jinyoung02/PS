package GraphTemplate;

import java.util.*;

public class ImplicitGraphBfsTemplate {
    // 8방향: 우, 우하, 하, 좌하, 좌, 좌상, 상, 우상
    static int[] dr = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dc = {1, 1, 0, -1, -1, -1, 0, 1};

    static int n;
    static int m;
    static boolean[][] visited;

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 1},
                {0, 1, 0, 1},
                {0, 1, 0, 1},
                {1, 0, 1, 1}
        };

        n = grid.length;
        m = grid[0].length;
        visited = new boolean[n][m];

        bfs(grid, 0, 0);
    }

    static void bfs(int[][] grid, int startR, int startC) {
        Queue<int[]> q = new ArrayDeque<>();

        q.add(new int[]{startR, startC});
        visited[startR][startC] = true;

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            for(int i=0; i<8; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    if(grid[nr][nc] == 1 && !visited[nr][nc]) {
                        q.add(new int[]{nr, nc});
                        visited[nr][nc] = true;
                    }
                }
            }
        }
    }
}