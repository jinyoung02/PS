class Solution {
    public int solution(int[][] dots) {
        
        // 네 점을 두 쌍으로 나누는 3가지 경우
        if ((dots[1][1] - dots[0][1]) * (dots[3][0] - dots[2][0])
                == (dots[3][1] - dots[2][1]) * (dots[1][0] - dots[0][0])) {
            return 1;
        }

        if ((dots[2][1] - dots[0][1]) * (dots[3][0] - dots[1][0])
                == (dots[3][1] - dots[1][1]) * (dots[2][0] - dots[0][0])) {
            return 1;
        }

        if ((dots[3][1] - dots[0][1]) * (dots[2][0] - dots[1][0])
                == (dots[2][1] - dots[1][1]) * (dots[3][0] - dots[0][0])) {
            return 1;
        }

        return 0;
    }
}