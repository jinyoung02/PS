class Solution {
    public int solution(int[] sides) {
        int answer = 0;

        int y; // 배열 중 큰 값
        int z; // 배열 중 작은 값

        if (sides[0] < sides[1]) {
            y = sides[1];
            z = sides[0];
        } else {
            y = sides[0];
            z = sides[1];
        }

        for (int x = 1; x <= y; x++) {
            if (z + x > y) {
                answer = answer + 1;
            }
        }

        for (int x = y + 1; x < y + z; x++) {
            answer = answer + 1;
        }

        return answer;
    }
}