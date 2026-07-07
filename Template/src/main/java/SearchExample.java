public class SearchExample {
    public void findMaxInGrid(int[][] grid) {
        if (grid == null || grid.length == 0) {
            System.out.println("격자가 비어있습니다.");
            return;
        }

        int maxVal = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
        int rows = grid.length; // 행의 개수
        int cols = grid[0].length; // 첫 번째 행의 열의 개수

        // 모든 행을 순회
        for (int i = 0; i < rows; i++) {
            // 모든 열을 순회
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > maxVal) {
                    maxVal = grid[i][j];
                }
            }
        }
        System.out.println("격자 내 최댓값: " + maxVal);
    }
}
// O(nxm) 시간복잡도

// 실행 예시
// SearchExample search = new SearchExample();
// int[][] grid = {
//     {3, 8, 1},
//     {9, 4, 2},
//     {5, 7, 6}
// };
// search.findMaxInGrid(grid); // 출력: 격자 내 최댓값: 9