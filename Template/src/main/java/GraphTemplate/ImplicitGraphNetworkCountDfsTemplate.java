package GraphTemplate;

public class ImplicitGraphNetworkCountDfsTemplate {
    // 4방향: 우, 하, 좌, 상
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};

    static int n;
    static int m;
    static boolean[][] visited;

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 0},
                {1, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 1}
        };

        int count = countNetwork(grid);

        System.out.println(count);
    }

    static int countNetwork(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        visited = new boolean[n][m];

        int count = 0;

        // 모든 좌표를 보면서 새로운 덩어리 찾기
        for(int r=0; r<n; r++) {
            for(int c=0; c<m; c++) {
                if(grid[r][c] == 1 && !visited[r][c]) {
                    dfs(grid, r, c);
                    count = count + 1;
                }
            }
        }

        return count;
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