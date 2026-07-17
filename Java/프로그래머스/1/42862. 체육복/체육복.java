import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int a = n - lost.length;

        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    a = a + 1;
                    break;
                }
            }
        }

        for(int i=0; i<lost.length; i++) {
            if(lost[i] != -1) {
                for(int j=0; j<reserve.length; j++) {
                    if(reserve[j] != -1 && Math.abs(lost[i] - reserve[j]) == 1) {
                        reserve[j] = -1;
                        a = a + 1;
                        break;
                    }
                }
            }
        }

        answer = a;
        return answer;
    }
}