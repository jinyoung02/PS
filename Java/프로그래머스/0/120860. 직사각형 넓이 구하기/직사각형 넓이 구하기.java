class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        int maxX = dots[0][0];
        int minX = dots[0][0];
        int maxY = dots[0][1];
        int minY = dots[0][1];

        for (int i = 0; i < 4; i++) {
            if (dots[i][0] > maxX) {
                maxX = dots[i][0];
            }

            if (dots[i][0] < minX) {
                minX = dots[i][0];
            }

            if (dots[i][1] > maxY) {
                maxY = dots[i][1];
            }

            if (dots[i][1] < minY) {
                minY = dots[i][1];
            }
        }

        int a = maxX - minX;
        int b = maxY - minY;

        answer = a * b;

        return answer;
    }
}