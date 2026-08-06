class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(i, n, computers, visited);
                answer += 1;
            }
        }

        return answer;
    }

    public void dfs(int cur, int n, int[][] computers, boolean[] visited) {
        visited[cur] = true;

        for(int next=0; next<n; next++) {
            if(computers[cur][next] == 1 && !visited[next]) {
                dfs(next, n, computers, visited);
            }
        }
    }
}