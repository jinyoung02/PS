package GraphTemplate;

public class ImplicitGraphDfsTemplate {
    // 4방향: 우, 하, 좌, 상
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};

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

        dfs(grid, 0, 0);
    }

    static void dfs(int[][] grid, int r, int c) {
        visited[r][c] = true;

        for(int i=0; i<4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr >= 0 && nr < n && nc >= 0 && nc < m) {
                if(grid[nr][nc] == 1 && !visited[nr][nc]) {
                    dfs(grid, nr, nc);
                }
            }
        }
    }
}